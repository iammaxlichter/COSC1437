package CHAPTER6;

public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private static final double RATE = 0.05;

    public void setInvoiceNumber(int num) {
        this.invoiceNumber = num;
    }
    public void setSaleAmount(double amt) {
        this.saleAmount = amt;
    }
    public double getSaleAmount() {
        return saleAmount;
    }
    public int getInvoiceNumber() {
        return invoiceNumber;
    }
    public void display() {
        System.out.println("Invoice #" + invoiceNumber +
                           "  Amount of sale: $" + saleAmount + "  Tax: $" + (RATE*saleAmount));
    }
}
