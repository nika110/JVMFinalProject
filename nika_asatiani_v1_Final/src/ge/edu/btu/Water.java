package ge.edu.btu;

public class Water {

    String customerNumber;
    double amount;

    public Water() {
    }

    public Water(double amount, String customerNumber) {
        this.amount = amount;
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Water{" + "customerNumber=" + customerNumber + ", amount=" + amount + '}';
    }
}
