package ChainOfResponsibilityPattern.Challenge;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildChainATM();
        atm.dispense(request);
    }

    private static ATM buildChainATM(){
        var atmEUR = new EuroATM(null);
        var atmUS = new UsDollarATM(atmEUR);

        return atmUS;
    }

}
