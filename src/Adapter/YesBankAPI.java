package Adapter;

public class YesBankAPI {
    public long getBalance(String UserName, String password){
        return 1000;
    }
    public char doTransaction(String fromUsername, String toUserName, String fromUserPassword, double amount){
        return 'y';
    }
    public boolean changePin(String fromUsername, String password,int currentPin, int newPin){
        return true;
    }
}
