import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int hour = Integer.parseInt(time.substring(0,2));
        if (time.endsWith("AM") ) {
            if (hour == 12){
                hour = 0;
            }
        }
        else if(hour<12){
            hour+=12;
        }
        System.out.printf("%02d:%s",hour,time.substring(3,8));

    }
}
