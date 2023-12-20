package level4;

import java.util.Scanner;

public class Question10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int numSize = sc.nextInt();
        int[] arr = new int[basket];

        for (int n = 0; n < numSize; n++) {
            int startNum  = sc.nextInt();
            int endNum  = sc.nextInt();
            int ballNum  = sc.nextInt();
            for (int j = startNum-1; j<=endNum-1;j++){
                arr[j] = ballNum;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
