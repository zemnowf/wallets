package Wallets;

public class BaseWallet<Number> {
    private Number amount;

    public BaseWallet(Number amount) {
        this.amount = amount;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }
}
