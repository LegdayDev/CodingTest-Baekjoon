package solution;

import java.io.*;

/**
 * Question30802 클래스는 입력된 데이터를 처리하여 특정 계산 결과를 출력하는 프로그램입니다.
 *
 * <주요 기능>
 * 1. 사용자로부터 총 인원 수(total)와 사이즈별 인원(sizeList)을 입력받습니다.
 * 2. 티셔츠 묶음 수(T)와 연필 묶음 수(P)를 입력받습니다.
 * 3. 다음 계산을 수행합니다:
 *    - 티셔츠 묶음의 총 개수를 계산하여 출력합니다.
 *    - 연필 묶음으로 나눴을 때 몫과 나머지를 계산하여 출력합니다.
 * 4. BufferedReader와 BufferedWriter를 사용하여 입출력을 처리합니다.
 */
public class Question30802 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer total = Integer.parseInt(br.readLine()); // 총 인원

        String[] sizeList = br.readLine().split(" ");  // 사이즈별 인원 수
        String[] tAndPList = br.readLine().split(" "); // 티셔츠, 연필 묶음 수

        Integer T = Integer.parseInt(tAndPList[0]); // 티셔츠 묶음
        Integer P = Integer.parseInt(tAndPList[1]); // 연필 묶음

        int tCount = 0; // 티셔츠 묶음 카운트 변수
        for (String size : sizeList) {
            Integer iSize = Integer.parseInt(size); // 형변환

            if (iSize != 0 && iSize <= T) {
                tCount += 1;
            } else if (iSize != 0 && iSize > T) {
                if (iSize % T == 0) {
                    tCount += (iSize / T);
                } else
                    tCount = tCount + (iSize / T) + 1;
            }
        }

        bw.write(Integer.toString(tCount) + "\n");
        bw.flush();
        bw.write(Integer.toString(total / P) + " " + Integer.toString(total % P));

        bw.close();
        br.close();
    }
}
