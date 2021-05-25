package Code_Qoutient;

import java.util.Scanner;

public class SortedArrayRotation {
    static int rotationCount(int arr[], int size) {
        int min = arr[0], min_index = 0;
        for (int i = 0; i < size; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    min_index = i;
                }
            }
        return min_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();            //test cases
        for (int q = 0; q < Testcase; q++) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(rotationCount(arr, num));
        }//to read array and perform operations
    }
}
