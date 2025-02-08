package StrategyPattern.Challenge;

public interface Payment {

    void pay();

    Payment paymentWithCard = () -> System.out.println("Payment made with card");
    Payment paymentWithBankTransfer = () -> System.out.println("Payment made with a bank transfer");
}
