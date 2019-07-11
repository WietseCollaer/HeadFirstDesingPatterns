package dance;

import java.util.List;

public class EpicChoreography {

    private List<Command> danceMoves;

    public EpicChoreography(List<Command> danceMoves) {
        this.danceMoves = danceMoves;
    }

    public void dance() {
        danceMoves.forEach(Command::execute);
    }
}
