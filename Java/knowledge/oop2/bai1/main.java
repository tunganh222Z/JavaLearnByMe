package knowledge.oop2.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Account> accountList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String id = sc.nextLine();
            String customerId = sc.nextLine();
            int accountNumber = sc.nextInt();
            int pinCode = sc.nextInt();
            int balance = sc.nextInt();
            accountList.add(new Account(id, customerId, accountNumber, pinCode, balance));
        }

        int t = sc.nextInt();
    }
}
