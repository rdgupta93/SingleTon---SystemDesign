package Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = new ICICIBankAPIAdapter();
    }
    public void checkBalance(User user){
        double d = bankAPIAdapter.checkBalance(user);
        System.out.println("Balance = " + d);

    }

    public void TransactionMoney(User fromUser, User toUser, double amount) {
        if(bankAPIAdapter.checkBalance(fromUser)<amount){
            System.out.println("Transaction Failed");
        }
       int status = bankAPIAdapter.doTransaction(fromUser, toUser,amount);
        switch (status){
            case 1:
                System.out.println("Successful");
                break;
            case 0:
                System.out.println("failed");
                break;
            case 2:
                System.out.println("In Progress");
                break;


        }
    }
}
