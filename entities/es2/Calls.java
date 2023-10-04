package entities.es2;

public class Calls {
    private int duration;
    private int phoneNumCalled;

    public int getDuration() {
        return duration;
    }

    public int getPhoneNumCalled() {
        return phoneNumCalled;
    }

    public Calls() {
    }
    public Calls(int duration, int phoneNumCalled) {
        this.duration = duration;
        this.phoneNumCalled = phoneNumCalled;
    }
}
