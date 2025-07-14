package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h2>6단계 : 2444</h2>
 * <li>입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.</li>
 * <li>출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.</li>
 */
public class Question2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputData = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputData; i++) {
            for (int j = inputData - (i + 1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < inputData - 1; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = (inputData - (i + 1)) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}