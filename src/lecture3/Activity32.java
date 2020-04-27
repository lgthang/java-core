package lecture3;
import java.util.Scanner;
public class Activity32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào màng thứ nhất: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i <a.length ; i++) {
            System.out.print("a[" + i + "]" + " = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nDộ dài của mảng: " + a.length);
        System.out.print("Mời bạn nhập vào màng thứ hai: ");
        int m = sc.nextInt();
        int [] b = new int[m];
        for (int i = 0; i <b.length ; i++) {
            System.out.print("b[" + i + "]" + " = ");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nDộ dài của mảng: " + b.length);
        int[] c = new int[a.length + b.length];
        int cout = 0;
        for (int i = 0; i <a.length ; i++) {
            c[i] = a[i];
            cout++;
        }
        for (int i = 0; i <b.length ; i++) {
            c[cout++] = b[i];
        }
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i] + "");
        }
        System.out.println("\nĐộ dài mảng: " + c.length);
    }
}
