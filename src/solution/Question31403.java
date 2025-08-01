package solution;

import java.io.*;

public class Question31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int result1 = (Integer.parseInt(A)+Integer.parseInt(B))-Integer.parseInt(C);
        int result2 = Integer.parseInt(A+B)-Integer.parseInt(C);

        bw.write(result1+"\n");
        bw.write(result2+"\n");

        br.close();
        bw.close();
    }
}
