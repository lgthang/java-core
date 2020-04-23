package lecture2;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            System.out.print(i + "+");
            sum = sum + i;
        }
        System.out.println(" = " + sum);
        System.out.println("Trung bình cộng =" + (float)sum/n );
    }
}
