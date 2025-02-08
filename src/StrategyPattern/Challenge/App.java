package StrategyPattern.Challenge;

import StrategyPattern.Authenticator;

public class App {

    public static void main(String[] args) {
        var checkoutPage = new CheckoutPage();

        checkoutPage.pay(Payment.paymentWithCard);
        checkoutPage.pay(Payment.paymentWithBankTransfer);

    }
}
