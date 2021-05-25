package Code_Qoutient;

// Java program to count occurrences
// of an element

import java.util.Scanner;

class OccurrenceCount {
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
                res++;
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        for (int q =0; q< Testcase;q++){
            int num = sc.nextInt();
            int key = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(countOccurrences(arr, num, key));
        }
    }
}
