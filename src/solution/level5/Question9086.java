package solution.level5;

import java.io.*;

public class Question9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for(int i=0;i<testcase;i++){
            String inputData = br.readLine();

            bw.write(inputData.charAt(0));
            bw.write(inputData.charAt(inputData.length()-1));
            bw.write("\n");
            bw.flush();
        }
    }
}
