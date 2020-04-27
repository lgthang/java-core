package lecture3;

import javax.swing.*;
import java.util.Scanner;

public class Activity35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]" + " = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                e = i;
            }
        }
        System.out.println("\nGiá trị lớn nhất: " + max);
        System.out.println("\nVị trì max:" + e);
        int min = a[0];
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                d = i;
            }
        }
        System.out.println("\nGiá trị min: " + min);
        System.out.println("\nVị trí min: " + d);
        //giá trị max và vị trí max thứ hai
        int max2 = a[1];
        int max1 = a[0];
        int f = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
            }
            for (int j = 0; j < a.length; j++) {
                if (a[j] > max2 && a[j] < max1) {
                    max2 = a[j];
                    f = j;
                }
            }
        }
        System.out.println("max 2 :" + max2);
        System.out.println("Vị trí max2: " + f);
        //Giá trị min thứ hai và vị trí
        int min2 = a[1];
        int min1 = a[0];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1 ) {
                min1 = a[i];
            }
            for (int j = 0; j < a.length; j++) {
                if (a[j] < min2 && a[j] < min1) {
                    min2 = a[j];
                    k = j;
                }
            }
        }
        System.out.println("Giá trị min 2: " + min2);
        System.out.println("Vị trí min2: " + k);
        // thay thế các phần tuwrt âm bằng số 0
    }
}
