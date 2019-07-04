package com.cegeka.meetingroom;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class MeetingRoom {
    protected static final String OPENING_MEETING_ROOM = "Opening meeting room";
    private List<String> attendees;
    private static MeetingRoom meetingRoom;

    private MeetingRoom() {
        this.attendees = newArrayList();
        System.out.println(OPENING_MEETING_ROOM);
    }

    public static MeetingRoom getMeetingRoom() {
        if (meetingRoom == null) {
            meetingRoom = new MeetingRoom();
        }
        return meetingRoom;
    }

    public void addAttendees(List<String> attendees) {
        this.attendees.addAll(attendees);
    }

    public List<String> getAttendees() {
        return attendees;
    }
}
