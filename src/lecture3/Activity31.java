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
            System.out.println(arr[j]);
        }
        System.out.println("Độ dài của mảng là: " + arr.length);
        System.out.println("Mảng sau khi  bỏ trùng : ");
        for (int i = 0; i <n ; i++) {
            for (int j = i + 1; j <n ; ) {
                if (arr[i] == arr[j]){
                    for (int x = j; x < n ; x++) {
                        arr[x] = arr[x + 1];
                    }
                    n--;
                } else {
                    j++;
                }
                for (int m = 0; m <n ; m++) {
                    System.out.println(arr[m]);
                }
            }
        }
    }
}


