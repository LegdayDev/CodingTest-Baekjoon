package solution.others;

import java.io.*;
import java.util.*;

/**
 * Question17952 클래스는 주어진 시간과 작업 데이터를 기반으로 총 점수를 계산하는 프로그램입니다.
 *
 * 주요 기능:
 * - 매 시간 주어진 작업 데이터를 처리합니다.
 * - 작업은 점수와 소요 시간을 가지며, 사용할 수 있는 시간이 감소할 때마다 점수가 계산됩니다.
 * - Stack 자료 구조를 활용하여 작업 내용을 저장하고, 작업의 남은 시간을 추적합니다.
 * - 모든 입력 데이터를 처리한 후 결과적인 총 점수를 출력합니다.
 *
 * 처리 과정:
 * 1. 주어진 시간 동안 각 시간마다 작업 데이터를 입력받습니다.
 * 2. 입력된 작업이 있다면 Stack 자료 구조에 저장합니다.
 * 3. 한 시간 단위로 작업 시간을 감소시키고, 해당 작업이 완료되었을 경우 점수를 누적합니다.
 * 4. 최종 결과로 총 점수를 출력합니다.
 *
 * 입력 형식:
 * - 첫 번째 줄에 정수로 주어진 총 시간.
 * - 이후 각 줄마다 "0" 또는 "점수 소요시간" 형식으로 작업 데이터가 주어짐.
 *
 * 출력 형식:
 * - 최종 계산된 총 점수를 출력.
 */
public class Question17952 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalMin = Integer.parseInt(br.readLine());
        int totalScore = 0;
        Stack<List> st = new Stack<>();

        for (int i=0;i<totalMin;i++){
            List<Integer> list = new ArrayList<>();
            String[] work = br.readLine().split(" ");

            if(work[0].equals("0") && i == 0)
                continue;

            if(!work[0].equals("0")){
                Integer score = Integer.parseInt(work[1]);
                Integer workTime = Integer.parseInt(work[2]);

                list.add(score);
                list.add(workTime);

                st.push(list);
            }

            if(!st.empty()){
                List pop = st.peek();
                if((Integer)pop.get(1)-1==0){
                    totalScore+=(Integer)pop.get(0);
                    st.pop();
                }else{
                    pop.set(1,(Integer)pop.get(1)-1);
                }
            }

        }

        bw.write(String.valueOf(totalScore));
        bw.flush();

        bw.close();
        br.close();
    }
}
