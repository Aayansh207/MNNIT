package logic;

import java.time.LocalDateTime;

public class HumiditySensor extends Sensor<Double> implements Calibratable, Alertable {
    private double calibrationOffset;
    private double threshold;
    private static final double MIN = 0.0;
    private static final double MAX = 100.0;
    public HumiditySensor(String id, String location) {
        super(id, location);
        calibrationOffset = 0.0;
        threshold = 80.0;
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
        return "%RH";
    }

    @Override
    public String getStatus() {
        if (latestReading() == null) {
            return "NO DATA";
        }
        return latestCalibratedValue() >= threshold
                ? "HIGH"
                : "NORMAL";
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
        return isAlert()
                ? "Humidity threshold exceeded"
                : "None";
    }
}
