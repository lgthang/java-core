package lecture2;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum = sum + i;
            if(i==n){
            System.out.println(i + " = " + sum);}
            else {
                System.out.print(i + "+");
            }
        }
        System.out.println("Trung bình cộng =" + (float)sum/n );
    }
}
