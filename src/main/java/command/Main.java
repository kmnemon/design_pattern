package command;

public class Main {
    public static void main(String[] args) {
        //RaxOn event
        Sensor sensor = new RaxOnSensor(new RelayOnCommand());
        sensor.doCommand();

    }
}
