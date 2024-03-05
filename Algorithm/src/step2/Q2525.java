package step2;

import java.util.Scanner;

//2525
public class Q2525 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int hour, minute;
        int cookTime;
        hour = sc.nextInt();
        minute = sc.nextInt();
        cookTime = sc.nextInt();

        minute+=cookTime;
        if(minute >= 60){
            hour += (minute/60);
            minute = minute%60;
        }
        if(hour >= 24){
            hour = hour%24;
        }
        System.out.println(hour+" "+minute);
    }
}
