package lecture1;

import java.util.Scanner;

public class giaipt {
    public static void main(String [] args){
        System.out.println("Xin mời nhập a, b, c : ");
        Scanner sc = new Scanner(System.in);
        float a =  sc.nextFloat();
        float b =  sc.nextFloat();
        float c =  sc.nextFloat();
        if (a==0){
            System.out.println("Phương trình có nghiệm là : " + (-c/b));
        } else {
            float detal = b*b - 4*a*c;
            if(detal==0){
                System.out.println("Phương trình có nghiệm duy nhất: " + (-b/2*a));
            } else {
                if(detal<0){
                    System.out.println("Phương trình vô nghiệm");
                }else {
                    if(detal>0){
                        float x1 = (float) (-b - Math.sqrt(detal)/2*a);
                        float x2 =  (float)  (-b + Math.sqrt(detal)/2*a);
                        System.out.println("Phương trình có hai nghiệm là: ");
                        System.out.println("Nghiện thứ nhất là: " + x1);
                        System.out.println("Nghiện thứ hai là: " + x2);
                        }
                }
            }
        }
    }

}
