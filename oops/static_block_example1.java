class Bank {
    static String bankName;
    String customerName;
    int balance;

    static {
        bankName = "SBI Bank";
        System.out.println("Bank is ready");

    }

    public void show() {
        System.out.println(bankName + ":" + customerName + ":" + balance);

    }
}

public class static_block_example1 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.customerName = "Darshan";
        obj.balance = 50000;

        obj.show();
    }
}
