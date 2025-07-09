package solution;

import java.io.*;
import java.util.StringTokenizer;

public class Question10811 {
    public static void reverseRange(int[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || arr == null) {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basketSize = Integer.parseInt(st.nextToken());
        int changeNum = Integer.parseInt(st.nextToken());

        int[] myArray = new int[basketSize];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        for (int i = 0; i < changeNum; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());
            reverseRange(myArray, first - 1, end - 1);
        }

        for (int num : myArray) {
            bw.write(num + " ");
        }
        bw.flush();
    }
}
