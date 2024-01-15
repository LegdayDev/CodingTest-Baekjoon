package solution.level5;

import java.io.*;

public class Question27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputData = br.readLine();
        int inputIndex = Integer.parseInt(br.readLine());

        System.out.println(inputData.charAt(inputIndex - 1));
    }
}
