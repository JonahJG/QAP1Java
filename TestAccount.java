public class TestAccount {
    public static void main(String[] args) {

        // Set up new accounts, with starting balances
        Account acc1 = new Account("1", "Acc1", 5000);
        Account acc2 = new Account("2", "Acc2", 4000);

        // Print out current balance of accounts
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());

        // Transfer $1000 from one account to another
        int transferAmount = 1000;
        acc1.transferTo(acc2, transferAmount);

        // Print out new balance of accounts
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());
    }
}


