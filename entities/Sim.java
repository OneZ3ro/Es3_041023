package entities;

public class Sim {
    private int phoneNumber;
    private int remainingCredit = 0;
    private Calls[] calls = new Calls[5];

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getRemainingCredit() {
        return remainingCredit;
    }

    public Calls[] getCalls() {
        return calls;
    }

    public Sim(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
