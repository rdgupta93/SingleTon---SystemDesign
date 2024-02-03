package Adapter;

public interface BankAPIAdapter {
    double checkBalance(User user);

    int doTransaction(User fromUSer, User toUser, double amount);
    boolean changePin(User user, int currentPin, int newPin);

}
