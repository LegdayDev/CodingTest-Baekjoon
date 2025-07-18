package solution;

import java.io.*;

/**
 * <h2>8단계 : 2745</h2>
 * <p>
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 * </p>
 * <li>
 * 입력 : 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
 * <p>
 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
 * </li>
 * <li>
 * 출력 : 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
 * </li>
 */
public class Question2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        int res = Integer.parseInt(N, B);
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
