package lecture1;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where are they learning Javacore : ");
        String input = sc.nextLine();
        if (input.equals("PlusPlus Academy")){
            System.out.println("Welcome to Javacore class");
        } else{
            System.out.println("request user to input again : ");
        }

    }
}
