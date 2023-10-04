package entities.es2;

public class Sim {
    private int phoneNumber;
    private int remainingCredit = 0;
    private Calls[] calls;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getRemainingCredit() {
        return remainingCredit;
    }

    public Calls[] getCalls() {
        return calls;
    }
    public void setCalls(Calls[] calls) {
        this.calls = calls;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sim(){}

    public Sim(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
