package driver;

import logic.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureSensor temperature =new TemperatureSensor("T-01", "Main Academic Block");
        HumiditySensor humidity =new HumiditySensor("H-01", "Hostel Block");
        PpmSensor ppm =new PpmSensor("G-01", "Chemical Lab");
        AqiSensor aqi =new AqiSensor("A-01", "Central Campus");
        List<Sensor<?>> sensors = new ArrayList<>();
        sensors.add(temperature);
        sensors.add(humidity);
        sensors.add(ppm);
        sensors.add(aqi);
        LocalDateTime t1 =LocalDateTime.of(2026, 9, 30, 9, 0);
        LocalDateTime t2 =LocalDateTime.of(2026, 9, 30, 9, 5);
        LocalDateTime t3 =LocalDateTime.of(2026, 9, 30, 9, 10);

        addInitialReading(temperature, t1, 35.0);
        addInitialReading(humidity, t1, 65.0);
        addInitialReading(ppm, t1, 800.0);
        addInitialReading(aqi, t1, 100);

        System.out.println("\n========== BEFORE BOUNDARY READINGS ==========");
        displayDashboard(sensors);

        addBoundaryReading(temperature, t2, 40.0);
        addBoundaryReading(humidity, t2, 80.0);
        addBoundaryReading(ppm, t2, 1000.0);
        addBoundaryReading(aqi, t2, 150);

        System.out.println("\n========== AFTER BOUNDARY READINGS ==========");
        displayDashboard(sensors);

        temperature.addReading(t3, 35.0);
        humidity.addReading(t3, 70.0);
        ppm.addReading(t3, 700.0);
        aqi.addReading(t3, 90);

        temperature.calibrate(1.5);
        System.out.println("\n========== STATE BEFORE THRESHOLD CHANGE ==========");
        displayDashboard(sensors);
        System.out.print("\nEnter new PPM alert threshold: ");
        double newPpmThreshold = sc.nextDouble();
        System.out.println("\n========== BEFORE THRESHOLD CHANGE ==========");
        displaySingleSensor(ppm);

        ppm.setThreshold(newPpmThreshold);
        System.out.println("\n========== AFTER THRESHOLD CHANGE ==========");
        displaySingleSensor(ppm);
        System.out.println("\n========== CALIBRATED STATISTICS ==========");
        for (Sensor<?> sensor : sensors) {
            System.out.println("\n" + sensor.getId()+ " (" + sensor.getUnit() + ")");
            SensorUtil.printStatistics(sensor);
        }

        System.out.println("\n========== INVALID READING TEST ==========");
        boolean accepted = temperature.addReading(t3.plusMinutes(5), 100.0);
        System.out.println("Temperature 100°C accepted? " + accepted);
        System.out.println("Duplicate timestamp accepted? "
                + temperature.addReading(t3, 36.0));
        System.out.println("Statistics use calibrated values; changing a calibration "
                + "offset recalculates earlier raw readings.");
        System.out.println("PPM and AQI intentionally do not implement calibration; "
                + "their calibrated values equal their raw values.");
        System.out.println("Duplicate registration IDs are rejected by exact "
                + "value-and-type identity; numeric 3 and text \"03\" are distinct.");
        sc.close();
    }

    private static <T extends Number> void addInitialReading(
            Sensor<T> sensor, LocalDateTime timestamp, T value) {
        if (!sensor.addReading(timestamp, value)) {
            throw new IllegalStateException("Initial reading was rejected");
        }
    }

    private static <T extends Number> void addBoundaryReading(
            Sensor<T> sensor, LocalDateTime timestamp, T value) {
        if (!sensor.addReading(timestamp, value)) {
            throw new IllegalStateException("Boundary reading was rejected");
        }
    }

    private static void displayDashboard(
            List<Sensor<?>> sensors) {
        for (Sensor<?> sensor : sensors) {
            sensor.printDashboard();
            System.out.printf("Min/Max/Avg: ");
            SensorUtil.printStatistics(sensor);
            System.out.println();
        }
    }

    private static void displaySingleSensor(Sensor<?> sensor) {
        sensor.printDashboard();
        System.out.printf("Min/Max/Avg: ");
        SensorUtil.printStatistics(sensor);
    }
}
