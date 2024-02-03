package Adapter;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankAPI.getBalance(user.getName(),user.getPassword());
            return (double)balance;
    }

    @Override
    public int doTransaction(User fromUSer, User toUser, double amount) {
        char result = yesBankAPI.doTransaction(fromUSer.getName(),toUser.getName(), fromUSer.getPassword(),amount);
        if(result=='y'){
            return 1;
        }else if(result=='n'){
            return 0;
        }else{
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankAPI.changePin(user.getName(),user.getPassword(),currentPin,newPin);
    }
}
