package lecture3;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập mảng gồm n: ");
        int n = sc.nextInt(); // giá trị nhập từ bàn phim n
        int arr[] = new int[n]; // Khai báo mảng gồm n phần tử
        System.out.println("Mời bạn nhập giá trị cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng gốc : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        System.out.println("Độ dài của mảng là: " + arr.length);
        System.out.println("Mảng sau khi  bỏ trùng : ");
        int[] result = new int[arr.length];
        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean exited = false;
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == result[j]) {
                    exited = true;
                    break;
                }
            }
            if (!exited) {
                result[newLength] = arr[i];
                newLength++;
            }
        }
        int[] b = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            b[i] = result[i];
        }
        for (int i = 0; i < newLength; i++) {
            System.out.println(b[i]);
        }
    }
}

