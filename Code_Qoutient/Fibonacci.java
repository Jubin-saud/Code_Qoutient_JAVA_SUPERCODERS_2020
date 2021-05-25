package Codeqoutient;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        int n, first = 0, second = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i =1;i<=n;i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
