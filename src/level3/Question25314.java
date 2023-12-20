package level3;

import java.util.Scanner;

public class Question25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        for (int i = 0; i < inputNum/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
