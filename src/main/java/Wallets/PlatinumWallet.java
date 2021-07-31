package Wallets;

import Wallets.BaseWallet;

public class PlatinumWallet<Number, Double> extends BaseWallet<Number> {
    private Double amount;

    public PlatinumWallet(Number amount) {
        super(amount);
    }

}
