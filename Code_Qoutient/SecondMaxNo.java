package Code_Qoutient;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxNo {
    public static void main(String[] args) {
        int q = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[4] == arr[3]){
            removeDuplicates(arr, arr.length);
            System.out.println(arr[1]);
        }
        else
            System.out.println(arr[3]);

    }
    static int removeDuplicates(int[] arr, int n)
    {
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
        temp[j++] = arr[n-1];
        for (int i=0; i<j; i++)
            arr[n-1] = temp[i];
        return j;
    }

}

