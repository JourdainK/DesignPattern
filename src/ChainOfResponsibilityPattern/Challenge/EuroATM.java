package ChainOfResponsibilityPattern.Challenge;

public class EuroATM extends ATM{

    public EuroATM(ATM actualATM){
        super(actualATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.EUR){
            System.out.println("Dispensing €" + request.getAmount());
        } else if(actualATM != null){
            actualATM.dispense(request);
        }
    }
}
