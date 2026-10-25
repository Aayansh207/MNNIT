package logic;

import java.time.LocalDateTime;

public class PpmSensor extends Sensor<Double> implements Alertable {
    private static final double MIN = 0.0;
    private static final double MAX = 5000.0;
    private double threshold;

    public PpmSensor(String id, String location) {
        super(id, location);
        threshold = 1000.0;
    }

    @Override
    public boolean addReading(LocalDateTime timestamp, Double value) {
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
        return "PPM";
    }

    @Override
    public String getStatus() {
        if (latestReading() == null) {
            return "NO DATA";
        }
        return latestCalibratedValue() >= threshold ? "DANGEROUS" : "NORMAL";
    }

    @Override
    public boolean isAlert() {
        return latestReading() != null && latestCalibratedValue() >= threshold;
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
        return isAlert() ? "PPM threshold exceeded" : "None";
    }
}
