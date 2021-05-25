package Code_Qoutient;

import java.util.Scanner;
// fuckin works but :-(
// code qoutient does accept it

class ArrayPartition {
    public static void partitionArray(int[] arr, int x) {

        int n = arr.length;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end; ) {
            if (arr[i] < n) {

                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            } else if (arr[i] > x) {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            } else
                i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionArray(arr, 10);
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + "\n");

            i++;
        }
    }
}



