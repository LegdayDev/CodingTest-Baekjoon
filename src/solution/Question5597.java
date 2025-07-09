package solution;

import java.io.*;

public class Question5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] studentList = new int[30];

        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            studentList[studentNum-1] = 1;
        }

        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i]==0){
                bw.write((i+1)+"\n");
            }
        }
        bw.flush();
    }
}
