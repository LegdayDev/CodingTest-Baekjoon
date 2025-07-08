package solution.class02;

import java.io.*;

public class Question30802 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer total = Integer.parseInt(br.readLine());

        String[] sizePerson = br.readLine().split(" ");

        String[] mukum = br.readLine().split(" ");

        Integer T = Integer.parseInt(mukum[0]); // 티셔츠 묶음
        Integer P = Integer.parseInt(mukum[1]); // 연필 묶음

        int tCount = 0;
        for (String size : sizePerson) {
            if (Integer.parseInt(size) != 0 && Integer.parseInt(size) <= T) {
                tCount += 1;
            } else if (Integer.parseInt(size) != 0 && Integer.parseInt(size) > T) {
                tCount = tCount + (Integer.parseInt(size) / T);
            }
        }

        bw.write(Integer.toString(tCount) + "\n");
        bw.flush();
        bw.write(Integer.toString(total / P) + " " + Integer.toString(total % P) + "\n");

        bw.close();
        br.close();
    }
}
