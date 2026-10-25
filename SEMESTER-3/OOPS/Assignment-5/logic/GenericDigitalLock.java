package logic;

public class GenericDigitalLock<T> {
    private T[] securityKey;
    private boolean locked;
    public GenericDigitalLock(T[] securityKey) {
        this.securityKey = securityKey;
        this.locked = true;
    }

    public boolean tryOpen(T[] enteredKey) {
        if (enteredKey.length != securityKey.length) {
            return false;
        }
        for (int i = 0; i < securityKey.length; i++) {
            if (!securityKey[i].equals(enteredKey[i])) {
                return false;
            }
        }
        locked = false;
        return true;
    }

    public boolean isLocked() {
        return locked;
    }
}