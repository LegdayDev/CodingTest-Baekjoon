package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h2>7단계 : 2738</h2>
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * <li>입력 : 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
 * 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고,
 * 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.</li>
 * <li>출력 : 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.</li>
 */
public class Question2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] twoDimensionalArray = new int[n][m];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < n; i++) {
                StringTokenizer token = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < m; j++) {
                    twoDimensionalArray[i][j] += Integer.parseInt(token.nextToken());
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
