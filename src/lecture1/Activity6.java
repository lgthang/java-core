package lecture1;
import java.util.Scanner;
public class Activity6 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); // khai báo scanner
        System.out.print("Mời nhập số thứ nhất : ");
        int a = scanner.nextInt(); // lấy giá trị từ bàn phím
        System.out.print("Mời nhập số thứ hai : ");
        int b = scanner.nextInt(); //lấy giá trị từ bàn phím
        System.out.println("Kết quả : a + b = " + (a+b) );
        System.out.println("Kết quả : a - b = " + (a-b) );
        System.out.println("Kết quả : a x b = " + (a*b) );
        System.out.println("Kết quả : a / b = " + (a/b) );
        System.out.println("Kết quả : a mod b = " + (a%b) );
    }
}
