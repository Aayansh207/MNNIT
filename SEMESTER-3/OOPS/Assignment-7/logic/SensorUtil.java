package logic;

public class SensorUtil {
    public static double minimum(Sensor<?> sensor) {
        if (sensor.getHistory().isEmpty()) {return Double.NaN;}
        double min = Double.MAX_VALUE;
        for (Reading<?> reading : sensor.getHistory()) {
            double value = sensor.calibratedValue(reading.getRawValue());
            if (value < min) {min = value;}
        }
        return min;
    }

    public static double maximum(Sensor<?> sensor) {
        if (sensor.getHistory().isEmpty()) {
            return Double.NaN;
        }
        double max = -Double.MAX_VALUE;
        for (Reading<?> reading : sensor.getHistory()) {
            double value = sensor.calibratedValue(reading.getRawValue());
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double average(Sensor<?> sensor) {
        if (sensor.getHistory().isEmpty()) {
            return Double.NaN;
        }
        double sum = 0.0;
        for (Reading<?> reading : sensor.getHistory()) {
            sum += sensor.calibratedValue(reading.getRawValue());
        }
        return sum / sensor.getHistory().size();
    }

    public static void printStatistics(Sensor<?> sensor) {
        System.out.printf("Min: %.2f | Max: %.2f | Average: %.2f %s%n",minimum(sensor),maximum(sensor),average(sensor),sensor.getUnit());
    }
}
