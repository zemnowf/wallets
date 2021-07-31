import Wallets.BaseWallet;

import java.util.Scanner;

public class TransactionUtil {
    public static void executeTransaction(BaseWallet fromWallet, BaseWallet toWallet, Number amount){
        System.out.println("Баланс кошелька, с которого осуществляется перевод: " + fromWallet.getAmount());
        System.out.println("Баланс кошелька, на который осуществляется перевод: " + toWallet.getAmount());
        checkException(fromWallet, amount);
        fromWallet.setAmount((Integer)fromWallet.getAmount() - (Integer)amount);
        toWallet.setAmount((Integer)toWallet.getAmount() + (Integer)amount);
        System.out.println("Баланс кошелька, с которого осуществляется перевод: " + fromWallet.getAmount());
        System.out.println("Баланс кошелька, на который осуществляется перевод: " + toWallet.getAmount());
    }

    public static void checkException(BaseWallet fromWallet, Number amount){
        try{
            if((Integer)amount > (Integer)fromWallet.getAmount()){
                throw new AmountException("Недостаточно средств");
            }

            System.out.println("Перечисляется " + amount + " денег");
        } catch(AmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Конец транзакции");
        }
    }
}
