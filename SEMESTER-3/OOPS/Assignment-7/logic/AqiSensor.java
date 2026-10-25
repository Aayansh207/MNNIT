package logic;

import java.time.LocalDateTime;

public class AqiSensor extends Sensor<Integer> implements Alertable { 
    private double threshold; 
    private static final int MIN = 0;
    private static final int MAX = 500;

    public AqiSensor(String id, String location) {
        super(id, location);
        threshold = 150.0;
    }

    @Override
    public boolean addReading(LocalDateTime timestamp, Integer value) { 
        if (value == null || value < MIN || value > MAX
                || !canAddReading(timestamp)) {
            return false;
        } 
        history.add(new Reading<>(timestamp, value));
        return true;
    }

    @Override
    public double calibratedValue(Number rawValue) {
        return rawValue.doubleValue();
    }

    @Override
    public String getUnit() {
        return "AQI";
    }

    @Override
    public String getStatus() {
        if (latestReading() == null) {
            return "NO DATA";
        }
        double value = latestCalibratedValue();
        if (value >= threshold) {
            return "UNHEALTHY";
        }
        return "NORMAL";
    }

    @Override
    public boolean isAlert() {
        return latestCalibratedValue() >= threshold;
    }

    @Override
    public void setThreshold(double threshold) {
        if (!Double.isFinite(threshold)) {
            throw new IllegalArgumentException("Threshold must be finite");
        }
        this.threshold = threshold;
    }

    @Override
    public double getThreshold() {
        return threshold;
    }

    @Override
    public String getAlertMessage() {
        if (isAlert()) {
            return "AQI threshold exceeded";
        }
        return "None";
    }
}
