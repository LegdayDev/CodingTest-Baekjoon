package level4;

import java.util.Scanner;

public class Question10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int numSize = sc.nextInt();
        int[] arr = new int[numSize];
        for (int i = 0; i < numSize; i++) {
            arr[i] = sc.nextInt();
        }
        int inputNum = sc.nextInt();
        for (int num : arr) {
            if(num == inputNum)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
