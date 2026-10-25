package logic;

public interface Calibratable {

    void calibrate(double offset);

    double getCalibrationOffset();
}

