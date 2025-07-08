package solution.class01;

import java.io.*;

public class Question2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNum = br.readLine().split(" ");
        int total = 0;

        for (String s : inputNum) {
            total += Math.pow(Integer.parseInt(s),2); // TODO : 수정 필요
        }

        int result = total % 10;

        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}
