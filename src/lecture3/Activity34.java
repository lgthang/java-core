package lecture3;
import java.util.Scanner;
public class Activity34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập chuỗi: ");
        String s = sc.nextLine();
        System.out.print("Chuỗi là: ");
        char[] ch = s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]);
        }
    }
}

