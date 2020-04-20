package lecture1;
import java.util.Scanner;
public class Activity4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập giá trị của a: ");
        int a = sc.nextInt();
        for (int i = 1; i<=10; i++){
        System.out.println("Kết quả: " + a + " x " +  i  + " = " + a * i);
        }
    }
}
