package command;

import java.util.Map;

public class SensorCommandMapping {
    public static Map<Class<?>, Command> sensorCommandMap = Map.of(
            RaxOnSensor.class, new RelayOnCommand()
    );
}
