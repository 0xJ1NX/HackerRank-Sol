import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrA = new int[3];
        int[] arrB = new int[3];
        int aScore =0,bScore=0;
        for (int i = 0; i < 3; i++) {
            arrA[i]= sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arrB[i]= sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (arrA[i] > arrB[i]){
                aScore++;
            }
            else if (arrA[i] < arrB[i]){
                bScore++;
            }
        }

        System.out.print(aScore +" "+bScore);
    }
}
