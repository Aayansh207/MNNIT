package logic;

public class WrapperDigitalLock {
    private Integer[][] securityKeys;
    private Boolean[] locked;
    public WrapperDigitalLock(Integer[][] securityKeys) {
        this.securityKeys = securityKeys;
        this.locked = new Boolean[securityKeys.length];
        for (int i = 0; i < locked.length; i++) {
            locked[i] = true;
        }
    }

    public boolean tryOpen(int lockNumber, Integer[] enteredKey) {
        if (lockNumber < 0 ||
                lockNumber >= securityKeys.length) {
            return false;
        }
        if (enteredKey.length != securityKeys[lockNumber].length) {
            return false;
        }

        for (int i = 0; i < enteredKey.length; i++) {
            if (!securityKeys[lockNumber][i].equals(enteredKey[i])) {
                return false;
            }
        }
        locked[lockNumber] = false;
        return true;
    }

    public Boolean isLocked(int lockNumber) {
        return locked[lockNumber];
    }
}