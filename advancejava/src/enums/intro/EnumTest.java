package enums.intro;

public class EnumTest {
    public static void main(String[] args) {

        benefitsOfEnumOverConstant();

    }

    public static void benefitsOfEnumOverConstant(){
        System.out.println("****** Constant Method ******");
        constantMethod(1);
        constantMethod(2);
        constantMethod(3);
        constantMethod(4);
        constantMethod(5);
        constantMethod(100); //it does not give complaining, but it is doing some unnecessary task

        System.out.println("****** Enum Over Constant ******");
        enumMethod(TransactionType.DEPOSIT);
        enumMethod(TransactionType.WITHDRAW);
        enumMethod(TransactionType.TRANSFER);
        enumMethod(TransactionType.PAYMENT);
        enumMethod(TransactionType.OTHER);
        //enumMethod(TransactionType.AA); we can get RTE or CTE

        System.out.println("********************************");
        System.out.println("Transaction code for deposit "+ TransactionType.DEPOSIT.getTransactionCode());
        System.out.println("Transaction Ordinal  for deposit : " + TransactionType.DEPOSIT.ordinal());
        System.out.println("Transaction Name for deposit : " + TransactionType.DEPOSIT.name());
    }

    //constant method
    public static void constantMethod(int i){
        if(i==TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is Deposit");
        }else if(i==TransactionTypeConstant.WITHDRAW){
            System.out.println("Money is WithDraw");
        }else if(i==TransactionTypeConstant.TRANSFER){
            System.out.println("Money is Transfer");
        }else if(i==TransactionTypeConstant.PAYMENT){
            System.out.println("Money is Payment");
        }else if(i==TransactionTypeConstant.OTHER){
            System.out.println("Money is Other");
        }
    }

    //create method with enum
    public static void enumMethod(TransactionType tt){

        //1st way
//        if(tt== TransactionType.DEPOSIT){
//            System.out.println("Money is Deposit");
//        }else if(tt==TransactionType.WITHDRAW){
//            System.out.println("Money is WithDraw");
//        }else if(tt==TransactionType.TRANSFER){
//            System.out.println("Money is Transfer");
//        }else if(tt==TransactionType.PAYMENT){
//            System.out.println("Money is Payment");
//        }else if(tt==TransactionType.OTHER){
//            System.out.println("Money is Other");
//        }

        //2nd way: more recommanded
        switch (tt){
            case DEPOSIT :
                System.out.println("Money is DEPOSIT");
                break;
            case WITHDRAW :
                System.out.println("Money is WITHDRAW");
                break;
            case TRANSFER:
                System.out.println("Money is TRANSFER");
                break;
            case PAYMENT :
                System.out.println("Money is PAYMENT");
                break;
            case OTHER :
                System.out.println("Money is OTHER");
                break;
            default:
                System.out.println("");
        }
    }
}
