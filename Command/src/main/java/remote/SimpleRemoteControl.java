package remote;

public class SimpleRemoteControl {

    private Command command;
    private Command lastCommand;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }

}
