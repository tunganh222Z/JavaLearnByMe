package knowledge.oop2.bai1;

import java.util.regex.Pattern;

public class Account {
    private String id;
    private String customerID;
    private int accountNumber;
    private int pinCode;
    private int balance;



    public void transferMoney(){
    }

    public Account(String id, String customerID, int accountNumber, int pinCode, int balance) {
        this.id = id;
        this.customerID = customerID;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public void withdrawMoney (int drawMoney)throws SoDuKhongDu, DrawMoneyException{
        if (balance < 50000){
            throw new SoDuKhongDu("Tài khoản cần lớn hơn 50000VND");
        }

        if (drawMoney <= 0){
            throw new DrawMoneyException("Số tiền rút phải lớn hơn 0");
        }

        if (drawMoney > balance){
            throw new DrawMoneyException("Số tiền rút không thể lớn hơn balance");
        }

        balance = balance - drawMoney;
    }

    public int getBalance(){
        return balance;
    }

    public void depositMoney(){
        Pattern.compile(customerID);

    }
}
