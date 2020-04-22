package lecture2;

import java.util.Scanner;

public class Actyvity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Khai báo Scanner
        System.out.print("Mời bạn nhập n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" "); // in ra dấu cách
            for (int k = 1; k <= i; k++) System.out.print("* ");// in ra dấu sao
            System.out.println("");
        }
    }
}
