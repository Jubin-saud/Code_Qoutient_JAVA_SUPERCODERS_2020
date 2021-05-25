package Codeqoutient;

//import java.util.Scanner;
//
//class FibonacciRecursion {
//    static void reverseFibonacci(int n)
//    {
//        int[] a = new int[n];
//        a[0] = 0;
//        a[1] = 1;
//
//        for (int i = 2; i < n; i++)
//        {
//
//            a[i] = a[i - 2] + a[i - 1];
//        }
//
//        for (int i = n - 1; i >= 0; i--)
//        {
//
//            System.out.print(a[i] +"\n");
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        reverseFibonacci(n);
//
//    }
//}

import java.util.Scanner;

public class FibonacciCalc{
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNumber = sc.nextInt();
        for(int i = maxNumber-1; i >=0 ; i--){
            System.out.print(fibonacciRecursion(i) +"\n");
        }
    }
}