package lecture3;
import javax.swing.*;
import java.util.Scanner;
public class Activity35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <a.length; i++) {
            System.out.print("a[" + i + "]" + " = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int e=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > max){
                max = a[i];
                e = i;
            }
        }
        System.out.println("\nGiá trị lớn nhất: " + max);
        System.out.println("\nVị trì max:" + e);
        int min = a[0];
        int d = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]< min){
                min = a[i];
                e=i;
            }
        }
        System.out.println("\nGiá trị min: " + min);
        System.out.println("\nVị trí min: " + d);
    }
}
