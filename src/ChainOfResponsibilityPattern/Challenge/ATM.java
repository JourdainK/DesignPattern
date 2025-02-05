package ChainOfResponsibilityPattern.Challenge;

public abstract class ATM {

    public final ATM actualATM;

    public ATM(ATM actualATM){
        this.actualATM = actualATM;
    }

    public abstract void dispense(WithdrawalRequest request);
}
