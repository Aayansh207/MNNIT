package logic;

import java.time.LocalDateTime;

public class TemperatureSensor extends Sensor<Double> implements Calibratable, Alertable {
    private double calibrationOffset;
    private double threshold;
    private static final double MIN = -50.0;
    private static final double MAX = 60.0;
    public TemperatureSensor(String id, String location) {
        super(id, location);
        calibrationOffset = 0.0;
        threshold = 40.0;
    }

    @Override
    public boolean addReading(
            LocalDateTime timestamp, Double value) {
        if (value == null || value < MIN || value > MAX
                || !canAddReading(timestamp)) {
            return false;
        }
        history.add(new Reading<>(timestamp, value));
        return true;
    }

    @Override
    public double calibratedValue(Number rawValue) {
        return rawValue.doubleValue() + calibrationOffset;
    }

    @Override
    public String getUnit() {
        return "°C";
    }

    @Override
    public String getStatus() {
        if (latestReading() == null) {return "NO DATA";}
        double value = latestCalibratedValue();
        if (value >= threshold) {return "HIGH";}
        return "NORMAL";
    }

    @Override
    public void calibrate(double offset) {
        calibrationOffset = offset;
    }

    @Override
    public double getCalibrationOffset() {
        return calibrationOffset;
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
        if (isAlert()) {return "Temperature threshold exceeded";}
        return "None";
    }
}
