public class Account {
    // Instance variables
    private String id;
    private String name;
    private int balance;

    // Constructor with id and name (initial balance set to 0)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor with id, name, and initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for id
    public String getID() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Method to credit (add) amount to the balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Method to debit (subtract) amount from the balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Method to transfer amount from this account to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method to provide a formatted string of the account
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
