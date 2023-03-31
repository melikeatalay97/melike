package enums.intro;

public enum TransactionType {
    DEPOSIT(1),
    WITHDRAW(2),
    TRANSFER(3),
    PAYMENT(4),
    OTHER(5);

    private final int TransactionCode;
    //constructor
    //private access modifier is optional for Enum
    private TransactionType(int transactionCode){
        TransactionCode = transactionCode;
    }

    //getter Method
    public int getTransactionCode() {
        return TransactionCode;
    }
}
