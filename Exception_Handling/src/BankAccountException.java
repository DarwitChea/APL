class  InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class  InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}
public class BankAccountException {
    private float amount = 0f;
    public BankAccountException(float amount){
        this.amount = amount;
    }
    public float getBal() {
        return amount;
    }
    public void withdraw(float amount) throws InsufficientFundsException{
        if(amount > this.amount){
            throw new InsufficientFundsException("Your withdrawal exceeds current balance.");
        }else{
            this.amount -= amount;
            System.out.println("You withdrew: "+ amount);
        }
    }
    public void deposit(float amount)throws InvalidAmountException{
        if(amount < 0){
            throw new InvalidAmountException("Your deposit amount must be larger than 0.");
        }
        else{
            this.amount += amount;
            System.out.println("You deposited: "+ amount);
        }
    }
    public static void main(String[] args) {
        BankAccountException exceptionBankAccount = new BankAccountException(500);
        System.out.println("You balance: "+ exceptionBankAccount.getBal());
        try {
            exceptionBankAccount.withdraw(1000);
        }catch (InsufficientFundsException e){
            System.out.println("InsufficientFundsException : " + e.getMessage());
        }
        System.out.println("You balance: "+ exceptionBankAccount.getBal());
        try{
            exceptionBankAccount.deposit(-2000);
        }catch (InvalidAmountException e){
            System.out.println("InvalidAmountException : " + e.getMessage());
        }
        System.out.println("Your balance : "+ exceptionBankAccount.getBal());

        try{
            exceptionBankAccount.deposit(500);
        }catch (InvalidAmountException e){
            System.out.println("InvalidAmountException : " + e.getMessage());
        }
        System.out.println("You balance: "+ exceptionBankAccount.getBal());
    }
}
