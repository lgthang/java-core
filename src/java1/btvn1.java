package java1;
import java.util.Scanner;
public class btvn1 {
       public static void main(String args[]){
           Scanner scanner = new Scanner(System.in); // khai báo scanner
           System.out.print("Mời nhập a: "); // nhập biến a
           int a = scanner.nextInt(); // Lấy biến từ bàn phím
           System.out.print("Mời nhập b: " ); // nhập biến b
           int b = scanner.nextInt(); // Lấy biến từ bàn phím
           System.out.println("a+b = " + (a+b) );
           System.out.println("a-b = " + (a-b) );
           System.out.println("a*b = " + (a*b) );
           System.out.println("a/b = " + (a/b) );
           System.out.println("a%b = " + (a%b) );

    }
}
