package ge.edu.btu;

public class Electricity {

    String customerNumber;
    double amount;

    public Electricity() {
    }

    public Electricity(double amount, String customerNumber) {
        this.amount = amount;
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Electricity{" + "customerNumber=" + customerNumber + ", amount=" + amount + '}';
    }
}
