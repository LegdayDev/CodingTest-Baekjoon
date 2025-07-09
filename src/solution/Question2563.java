package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <h2>단계별로 풀기 7단계 : 2563번</h2>
 * <p>
 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
 * 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 * </p>
 */
public class Question2563 {
    public static void main(String[] args) throws IOException {
        /**
         *  * 100*100 모눈종이를 2차원배열로 만들어 전부 0으로 초기화
         *  * 입력받은 좌표(x,y)를 받으면 각각 10씩 더한만큼 1로 바꾸어 도형으로 시각화
         *  * 1인 자리가 색종이의 영역이므로 더하면 된다
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] field = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                field[i][j] = 0;
            }
        }

        int testCase = Integer.parseInt(br.readLine());
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            String[] inputLine = br.readLine().split(" ");
            xList.add(Integer.parseInt(inputLine[0]));
            yList.add(Integer.parseInt(inputLine[1]));
        }

        for (int i = 0; i < testCase; i++) {
            for (int x = xList.get(i); x <= xList.get(i) + 9; x++) {
                for (int y = yList.get(i); y <= yList.get(i) + 9; y++) {
                    field[x][y] = 1;
                }
            }
        }
        int total = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (field[i][j] == 1) total += field[i][j];
            }
        }

        System.out.println(total);
    }
}
