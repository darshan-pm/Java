class BankAccount {
    public String bankName;
    private int balance;
    protected String accountHolder;
    String accountType;

    // Parameterized constructor
    public BankAccount(String bankName, int balance, String accountHolder, String accountType) {
        this.bankName = bankName;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    // Setters
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}

public class AccessModifier_practice1 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("SBI", 50000, "Darshan", "Savings");
        System.out.println(obj.bankName);
        System.out.println(obj.getBalance());
        System.out.println(obj.accountHolder);
        System.out.println(obj.accountType);

    }
}