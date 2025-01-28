package Array;

import java.util.Scanner;

public class _1672_RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                accounts[i][j] = sc.nextInt();
            }
        }

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int customer = accounts.length;
        int richestCustomer = 0;

        for (int i = 0; i < customer; i++){
            int customerWealth = 0;
            for (int j =0; j < accounts[0].length; j++){
                customerWealth = customerWealth + accounts[i][j];
            }
            richestCustomer = Math.max(richestCustomer, customerWealth);
        }

        return richestCustomer;
    }

    public static void printArrays (int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
