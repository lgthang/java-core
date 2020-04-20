package lecture1;

import java.util.Scanner;

public class giaipt {
    public static void main(String [] args){
        System.out.println("Xin mời nhập a, b, c : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a==0){
            System.out.println("Phương trình có nghiệm là : " + (-c/b));
        } else {
            double detal = b*b - 4*a*c;
            if(detal==0){
                System.out.println("Phương trình có nghiệm duy nhất: " + (-b/2*a));
            } else {
                if(detal<0){
                    System.out.println("Phương trình vô nghiệm");
                }else {
                    if(detal>0){
                        double x1 = (-b - Math.sqrt(detal)/2*a);
                        double x2 = (-b + Math.sqrt(detal)/2*a);
                        System.out.println("Phương trình có hai nghiệm là: ");
                        System.out.println("Nghiện thứ nhất là: " + x1);
                        System.out.println("Nghiện thứ hai là: " + x2);
                        }
                }
            }
        }
    }

}
