import java.util.List;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static int numberOfAccountsCreated = 0;
    private static double totalMoneyDepositedAtBank = 0;
    

    public BankAccount() {
        this.accountNumber = assignAccountNumber();
        numberOfAccountsCreated++;
    }
    public void setCheckingBalance(double balance) {
        this.checkingBalance = balance;
    }
    public double getCheckBalance() {
        System.out.printf("Your current checking account balance is: $%f\n",this.checkingBalance);
        return this.checkingBalance;
    }
    public void setSavingBalance(double balance) {
        this.savingsBalance = balance;
    }
    public double getSavingBalance() {
        System.out.printf("Your current savings account balance is: $%f\n",this.savingsBalance);
        return this.savingsBalance;
    }
    public void depositChecking(double amount){
        checkingBalance += amount;
        totalMoneyDepositedAtBank += amount;
    }

    public void depositSavings(double amount){
        savingsBalance += amount;
        totalMoneyDepositedAtBank += amount;
    }
    
    public void withdrawChecking(double amount) {
        
        if(amount <= checkingBalance){
            checkingBalance -= amount;
            totalMoneyDepositedAtBank -= amount;
        } else {
            
            System.out.println("You have insufficient funds to make this withdrawal");
        }
    }

    public void withdrawSavings(double amount) {
        
        if(amount <= savingsBalance){
            savingsBalance -= amount;
            totalMoneyDepositedAtBank -= amount;
        } else {
            System.out.println("You have insufficient funds to make this withdrawal");
            
        }
    }
    
    
    public double getTotalBalance() {
        System.out.printf("Your combined balance is: $%f \n",(checkingBalance+savingsBalance));
        return checkingBalance + savingsBalance;
    }
    
    private static long assignAccountNumber() {
        return (long)Math.floor(Math.random() * 9_000_000_000L) * 1_000_000_000L;
        
    }
}
