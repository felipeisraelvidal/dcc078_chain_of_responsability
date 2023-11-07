package chain_of_responsability;

public class PurchaseRequest {
    private String description;
    private double amount;

    public PurchaseRequest(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
