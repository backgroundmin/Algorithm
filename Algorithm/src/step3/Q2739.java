package step3;

import java.util.Scanner;
//2739
public class Q2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tableNumber;
        tableNumber = sc.nextInt();
        for(int i = 0 ; i < 9 ; i++){
            System.out.println(tableNumber+" * "+(i+1)+" = "+(tableNumber*(i+1)));
        }
    }
}
