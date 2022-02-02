import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] count = str.split("[A-Z]");
        System.out.println(count.length);
    }
}
