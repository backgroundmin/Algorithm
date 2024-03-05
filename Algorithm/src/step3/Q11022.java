package step3;

import java.util.Scanner;
//11022
public class Q11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();
        for(int i = 0 ; i < caseCount ; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+num1+" + "+num2+" = "+(num1+num2));
        }
    }
}
