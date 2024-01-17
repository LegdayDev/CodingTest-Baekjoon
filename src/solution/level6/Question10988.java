package solution.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h2>6단계 : 10988</h2>
 * <p>
 * 문제 : 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.</p>
 * <li>입력:첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.</li>
 * <li>출력:첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.</li>
 */
public class Question10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputData = br.readLine();
        String palindrome = "";

        for (int i = inputData.length() - 1; i >= 0; i--) {
            palindrome += inputData.charAt(i);
        }
        if(inputData.equals(palindrome)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
