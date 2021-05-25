package Codeqoutient;

import java.util.Scanner;

public class primeNumbersGenerator {

    public static void main(String[] args) {

        int i;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int maxCheck = sc.nextInt();
        boolean isPrime = true;

        //Empty String
        String primeNumbersFound = "";

        for (i = 2; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i +"\n";
            }
        }
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

}