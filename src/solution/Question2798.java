package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Question2798 클래스는 숫자 카드 문제를 해결하기 위한 프로그램입니다.
 *
 * <주요 기능>
 * 1. 사용자로부터 카드의 개수와 숫자 제한(MaxNum)을 입력받습니다.
 * 2. 카드 값을 입력받아, 세 숫자의 합이 MaxNum을 초과하지 않으면서 최대가 되는 값을 찾습니다.
 * 3. 구한 결과를 출력합니다.
 *
 * <문제 풀이>
 * - 주어진 카드에서 3장의 숫자를 선택하는 모든 조합을 시도합니다.
 * - 각 조합의 합이 MaxNum 이하인지 확인하고, 이 중 최대 값을 구합니다.
 *
 * <제약 사항>
 * - 입력 값은 항상 유효한 정수 데이터로 제공됩니다.
 * - 카드의 개수(TestCase)는 3 이상이어야 합니다.
 */
public class Question2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer testCase = Integer.parseInt(st.nextToken());
        Integer maxNum = Integer.parseInt(st.nextToken());

        String[] cards = br.readLine().split(" ");

        int max = 0;
        for (int j = 0; j < testCase; j++) {
            for (int k = j + 1; k < testCase; k++) {
                for (int l = k + 1; l < testCase; l++) {
                    int curNum = Integer.parseInt(cards[j]) + Integer.parseInt(cards[k]) + Integer.parseInt(cards[l]);
                    if (curNum <= maxNum && max <= curNum)
                        max = curNum;
                }
            }
        }
        System.out.println(max);
    }
}
