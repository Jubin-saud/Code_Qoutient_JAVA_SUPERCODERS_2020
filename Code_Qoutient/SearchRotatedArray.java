package Code_Qoutient;

import java.util.Scanner;

public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();            //test cases
        for (int q = 0; q < Testcase; q++) {
            int key = sc.nextInt();   //key
            int num = sc.nextInt();  //size
            int[] arr = new int[num];  //array
            for (int i = 0; i < num; i++) {  //insert into array
                arr[i] = sc.nextInt();
            }
            System.out.println(searchRotatedSortedArray(arr, key));
        }
    }

    static int searchRotatedSortedArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                return i;
        }
        return -1;
    }


}