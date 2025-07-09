package solution;

import java.io.*;

/**
 * Question2231 클래스는 분해합(생성자)을 계산하기 위한 프로그램입니다.
 *
 * <주요 기능>
 * 1. 사용자로부터 수(inputNum)를 입력받습니다.
 * 2. 입력받은 수의 생성자(minNum)를 구하여 출력합니다:
 *    - 생성자가 존재하지 않을 경우 0을 반환합니다.
 * 3. BufferedReader와 BufferedWriter를 사용하여 입력과 출력을 처리합니다.
 *
 * <문제 풀이>
 * 분해합 문제는 주어진 수(inputNum)의 생성자를 구하는 것입니다.
 * - 생성자는 어떤 수(i)와 그 수의 각 자리 숫자의 합을 더했을 때 inputNum을 만드는 수입니다.
 * - 예를 들어, inputNum이 216일 경우, 198이 생성자가 됩니다. (198 + 1 + 9 + 8 = 216)
 * - 생성자가 존재하지 않으면 결과는 0을 반환합니다.
 * - 알고리즘:
 *   1) 0부터 inputNum-1까지 반복문을 실행합니다.
 *   2) 각 수(i)의 자리수를 더한 값과 i를 더합니다.
 *   3) 더한 값이 inputNum과 같으면 그 수(i)가 생성자입니다.
 *   4) 가장 작은 생성자를 찾으면 반복문을 종료하고 출력합니다.
 * 
 */
public class Question2231 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer inputNum = Integer.parseInt(br.readLine());

        Integer length = inputNum.toString().length();
        Integer startNum = Math.max(inputNum - length*9, 0);

        Integer minNum = 0;
        for(int i=startNum; i<inputNum; i++) {
            if (i + String.valueOf(i).chars().map(c -> c - '0').sum() == inputNum) {
                minNum = i;
                break;
            }
        }
        bw.write(Integer.toString(minNum));
        bw.flush();

        bw.close();
        br.close();
    }
}
