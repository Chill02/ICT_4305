package parkingstructure.com;

public class Money {

    private long cents;

    public Money(long cents) {
        this.cents = cents;
    }

    public long getCents() {
        return cents;
    }

    public double getDollars() {
        return cents / 100.0;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", getDollars());
    }
}
