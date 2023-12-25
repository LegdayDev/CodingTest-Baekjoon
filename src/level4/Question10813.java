package level4;

import java.io.*;
import java.util.StringTokenizer;

public class Question10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int basketQuantity = Integer.parseInt(st.nextToken());
        int changeNumber = Integer.parseInt(st.nextToken());

        int[] basketArr = new int[basketQuantity];

        for (int i = 0; i < basketArr.length; i++) {
            basketArr[i] = i + 1;
        }
        for (int i = 0; i < changeNumber; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(tokenizer.nextToken());
            int second = Integer.parseInt(tokenizer.nextToken());

            int temp = basketArr[first-1];
            basketArr[first-1] = basketArr[second-1];
            basketArr[second-1] = temp;
        }

        for (int i = 0; i < basketArr.length; i++) {
            bw.write(basketArr[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
