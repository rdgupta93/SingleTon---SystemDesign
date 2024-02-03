package Adapter;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double checkBalance(User user) {
        return iciciBankAPI.checkBalance(generateuserToken(user));
    }

    @Override
    public int doTransaction(User fromUSer, User toUser, double amount) {
        return iciciBankAPI.transferMoney(generateuserToken(fromUSer),generateuserToken(toUser),amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankAPI.changePin(generateuserToken(user),newPin,currentPin);
    }
    private String generateuserToken(User user){
        return user.getName() + user.getPassword(); // random token
    }
}
