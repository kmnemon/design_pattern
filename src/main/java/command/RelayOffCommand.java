package command;

public class RelayOffCommand implements Command{
    @Override
    public void exec() {
        System.out.println("exec relay off command");
    }
}
