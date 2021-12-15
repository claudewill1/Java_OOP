public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        
        // deposit and withdraw acc1
        acc1.depositChecking(5000);
        acc1.depositSavings(150000);
        acc1.withdrawChecking(4999.99);
        acc1.withdrawSavings(200000);

        acc2.depositChecking(1400);
        acc2.depositSavings(5650);

        acc1.getCheckBalance();
        acc1.getSavingBalance();
        acc1.getTotalBalance();

        acc2.getCheckBalance();
        acc2.getSavingBalance();
        acc2.getTotalBalance();

        
        

    }
}
