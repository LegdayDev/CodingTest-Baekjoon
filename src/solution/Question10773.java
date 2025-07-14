package solution;

import java.io.*;
import java.util.*;

/**
 * Question10773 클래스는 입력된 정수 데이터를 기반으로 특정 연산을 수행하여 최종 합계를 계산하는 프로그램입니다.
 *
 * 이 클래스는 입력 데이터를 순차적으로 처리하며, 다음과 같은 규칙을 따릅니다:
 *
 * - 정수 0이 입력되면, 현재 저장된 숫자 목록에서 마지막 값을 제거합니다.
 * - 0이 아닌 정수가 입력되면, 해당 값을 목록에 추가합니다.
 *
 * 입력된 데이터 처리가 모두 완료된 후, 저장된 숫자 목록의 모든 요소를 합산하여 출력합니다.
 *
 * 주요 기능:
 * - 이전 숫자 취소 기능 (정수 0 입력 시)
 * - 숫자 합산 및 결과 출력
 *
 * 프로그램은 표준 입력을 통해 테스트 개수와 각 입력 값을 처리하며, 표준 출력으로 결과를 출력합니다.
 */
public class Question10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int testcase = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < testcase; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            if(list.size()!=0 && inputNum == 0){
                list.remove(list.size()-1);
            }else
                list.add(inputNum);
        }

        for (Integer i : list) {
            total+=i;
        }

        System.out.println(total);
        br.close();
    }
}
