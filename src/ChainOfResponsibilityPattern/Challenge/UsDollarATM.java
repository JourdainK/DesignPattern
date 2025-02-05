package ChainOfResponsibilityPattern.Challenge;

public class UsDollarATM extends ATM{

    public UsDollarATM(ATM actualATM){
        super(actualATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency() == WithdrawalRequest.Currency.USD){
            System.out.println("Dispensing $" + request.getAmount());
        }else if(actualATM != null){
            actualATM.dispense(request);
        }

    }
}
