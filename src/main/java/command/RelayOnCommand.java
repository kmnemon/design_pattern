package command;

public class RelayOnCommand implements Command{
    @Override
    public void exec() {
        System.out.println("exec relay on command");
    }
}
