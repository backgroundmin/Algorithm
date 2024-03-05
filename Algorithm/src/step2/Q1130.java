package step2;

import java.util.Scanner;

public class Q1130 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(">");
        }
        else if(num1 < num2){
            System.out.println("<");
        }
        else if(num1 == num2){
            System.out.println("==");
        }
    }
}
