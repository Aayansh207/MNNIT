package logic;

public interface Alertable {

    boolean isAlert();

    void setThreshold(double threshold);

    double getThreshold();
}

