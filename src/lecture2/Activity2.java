package lecture2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Khai báo scanner
        System.out.print("Mời bạn nhập n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == 0 || j == 0 || i == 1 || j == 1 || i == n-1 || j == n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
