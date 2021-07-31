import Wallets.GoldWallet;
import Wallets.PlatinumWallet;

public class Main {
    public static void main(String[] args) {
        GoldWallet goldWallet = new GoldWallet(1000);
        PlatinumWallet platinumWallet = new PlatinumWallet(500);
        TransactionUtil.executeTransaction(goldWallet, platinumWallet, 300);
    }
}
