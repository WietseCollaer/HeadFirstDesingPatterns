package com.cegeka.meetingroom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static com.cegeka.meetingroom.MeetingRoom.getMeetingRoom;
import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class MeetingRoomTest {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        Whitebox.setInternalState(MeetingRoom.class, "meetingRoom", (MeetingRoom) null);
    }

    @Test
    public void getMeetingRoom_whenRequestingMeetingRoomForFirstTime_thenPrintOnlyOnce() {
        getMeetingRoom();

        assertThat(outputStream.toString()).containsOnlyOnce(MeetingRoom.OPENING_MEETING_ROOM);
    }

    @Test
    public void getMeetingRoom_whenRequestingMeetingRoomMultipleTimes_thenPrintOnlyOnce() {
        getMeetingRoom();
        getMeetingRoom();
        getMeetingRoom();
        getMeetingRoom();

        assertThat(outputStream.toString()).containsOnlyOnce(MeetingRoom.OPENING_MEETING_ROOM);
    }

    @Test
    public void getMeetingRoom_shouldReturnTheSameHashCode() {
        int meetingRoomA = getMeetingRoom().hashCode();
        int meetingRoomB = getMeetingRoom().hashCode();

        assertThat(meetingRoomA).isEqualTo(meetingRoomB);
    }

    @Test
    public void getAttendees_shouldAlwaysReturnTheSameListOfAttendeesForEachInstance() {
        getMeetingRoom().addAttendees(newArrayList("Max", "Alexandre", "Wietse"));
        MeetingRoom meetingRoom = getMeetingRoom();

        List<String> attendees = meetingRoom.getAttendees();

        assertThat(attendees).containsExactlyInAnyOrder("Max", "Alexandre", "Wietse");
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }
}
