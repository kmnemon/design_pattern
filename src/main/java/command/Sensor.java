package command;

public abstract class Sensor {
    private Command command;

    public Sensor(Command command) {
        this.command = command;
    }

    public void doCommand(){
        command.exec();
    }

}
