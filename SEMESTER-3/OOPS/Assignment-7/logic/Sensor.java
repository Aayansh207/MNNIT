package logic;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Sensor<T extends Number> {
    protected String id;
    protected String location;
    protected List<Reading<T>> history;
    public Sensor(String id, String location) {
        this.id = id;
        this.location = location;
        this.history = new ArrayList<>();
    }

    public String getId() {return id;}
    public String getLocation() {return location;}
    public List<Reading<T>> getHistory() {return history;}
    public abstract boolean addReading(LocalDateTime timestamp, T value);
    public abstract double calibratedValue(Number rawValue);
    public abstract String getUnit();
    public abstract String getStatus();
    public abstract String getAlertMessage();

    protected boolean canAddReading(LocalDateTime timestamp) {
        if (timestamp == null) {
            return false;
        }
        Reading<T> latest = latestReading();
        return latest == null || timestamp.isAfter(latest.getTimestamp());
    }
    public Reading<T> latestReading() {
        if (history.isEmpty()) {return null;}
        return history.get(history.size() - 1);
    }

    public double latestCalibratedValue() {
        Reading<T> latest = latestReading();
        if (latest == null) {return Double.NaN;}
        return calibratedValue(latest.getRawValue());
    }

    public void printDashboard() {
        Reading<T> latest = latestReading();
        System.out.println("Sensor ID       : " + id);
        System.out.println("Location        : " + location);
        System.out.println("Unit            : " + getUnit());
        if (latest == null) {
            System.out.println("Reading         : No reading");
            System.out.println("Status          : NO DATA");
            System.out.println("Alert           : None");
            return;
        }

        System.out.println("Timestamp       : " + latest.getTimestamp());
        System.out.println("Raw Value       : " + latest.getRawValue());
        System.out.printf("Calibrated Value: %.2f %s%n",latestCalibratedValue(),getUnit());
        System.out.println("Status          : " + getStatus());
        System.out.println("Alert           : " + getAlertMessage());
    }
}
