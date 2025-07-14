package solution;

import java.io.*;
import java.util.*;

/**
 * Question10828 클래스는 명령어를 입력받아 스택(Stack) 자료구조를 조작하는 기능을 수행합니다.
 *
 * 해당 클래스는 표준 입력으로 명령어와 데이터를 받아 처리하며, 명령어는 다음과 같습니다:
 *
 * - "push X": 정수 X를 스택에 삽입합니다.
 * - "pop": 스택의 최상단 요소를 제거하고 출력합니다. 스택이 비어있으면 -1을 출력합니다.
 * - "size": 스택에 포함된 요소의 개수를 출력합니다.
 * - "empty": 스택이 비어있으면 1을, 비어있지 않으면 0을 출력합니다.
 * - "top": 스택의 최상단 요소를 출력합니다. 스택이 비어있으면 -1을 출력합니다.
 *
 * 사용자는 표준 입력을 통해 명령어를 입력하며, 프로그램은 이를 처리하여 표준 출력으로 결과를 출력합니다.
 *
 * 이 클래스는 예외적으로 표준 입력 및 출력을 사용하고, StringTokenizer를 이용해 입력 명령과 데이터를 파싱합니다.
 * BufferedReader를 사용해 입력 성능을 최적화하며, java.util.Stack을 통해 스택 기능을 구현합니다.
 */
public class Question10828 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());
        Stack stack = new Stack<Integer>();
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.empty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.empty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "top":
                    if(stack.empty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.peek());
                    break;
            }
        }
        br.close();
    }
}
