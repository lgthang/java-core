package lecture1;
import java.util.Scanner;
public class Activity3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); // khai báo scanner
        System.out.print("Mời nhập a: "); // nhập giá trị của a
        int a = scanner.nextInt(); // lấy giá trị từ bàn phím
        System.out.print("Mời nhập b: "); // nhập giá trị của b
        int b = scanner.nextInt(); // lấy giá trị từ bàn phím
        System.out.println("Kết quả: a + b =" + (a+b));
        System.out.println("Kết quả: a * b = " + (a*b));
    }

}
