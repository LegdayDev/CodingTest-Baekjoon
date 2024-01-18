package solution.level6;

import java.io.*;
import java.util.StringTokenizer;

/**
 * <h2>6단계 : 25206</h2>
 * 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
 * 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
 * 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
 * P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
 * <li>입력 : 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.</li>
 * <li>출력 : 치훈이의 전공평점을 출력한다. 정답과의 절대오차 또는 상대오차가 (10^{-4}) 이하이면 정답으로 인정한다.</li>
 */
public class Question25206 {
    private static double currentGrade = 0.0; // 학점의 총합 (학점 X 과목평점을 계산하는 메서드를 외부로 뺐기 때문에 static 으로 선언)

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double[] subjectScore = new double[20];
        double totalAveScore = 0.0; // 학점 X 과목평점 의 합계

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            double aveScore = aveCalculator(score, grade);

            subjectScore[i] = aveScore;
        }
        for (double value : subjectScore) {
            if (value != -1) { // P 과목을 제외한 인덱스만 더해준다.
                totalAveScore += value;
            }
        }

        System.out.printf("%.6f\n", (totalAveScore / currentGrade));
    }

    private static double aveCalculator(double score, String grade) {
        switch (grade) {
            case "A+":
                currentGrade += score;
                score *= 4.5;
                break;
            case "A0":
                currentGrade += score;
                score *= 4.0;
                break;
            case "B+":
                currentGrade += score;
                score *= 3.5;
                break;
            case "B0":
                currentGrade += score;
                score *= 3.0;
                break;
            case "C+":
                currentGrade += score;
                score *= 2.5;
                break;
            case "C0":
                currentGrade += score;
                score *= 2.0;
                break;
            case "D+":
                currentGrade += score;
                score *= 1.5;
                break;
            case "D0":
                currentGrade += score;
                score *= 1.0;
                break;
            case "F":
                currentGrade += score;
                score = 0;
                break;
            default:
                score = -1;
                break;
        }
        return score;
    }
}