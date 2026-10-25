package logic;

import java.time.LocalDateTime;

public class Reading<T extends Number> {

    private final LocalDateTime timestamp;
    private final T rawValue;

    public Reading(LocalDateTime timestamp, T rawValue) {
        this.timestamp = timestamp;
        this.rawValue = rawValue;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public T getRawValue() {
        return rawValue;
    }
}

