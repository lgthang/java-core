package lecture1;

import java.util.Scanner;

public class Actiity5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); // khai báo scanner
        System.out.print("Mời nhập : " ); // nhập số
        int n = scanner.nextInt(); // lấy giá trị từ bàn phím
        System.out.println(n * 1 + " + " + n * 11 + " + " + n * 111 + " = " + (n * 1 + n * 11 + n * 111));

    }
}
