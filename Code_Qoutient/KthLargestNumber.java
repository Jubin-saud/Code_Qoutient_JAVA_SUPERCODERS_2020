package Code_Qoutient;

import java.util.Scanner;

public class KthLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //test cases
        int k = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(kthLargest(arr,size,k));
    }
    static int kthLargest(int[] arr, int size, int k){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = min;
                    arr[i] = arr[j];
                    arr[j] = temp;
                    min = arr[i];
                }
            }
        }

        return arr[arr.length - 1 - k];
    }
//        for(int i = 0; i<size; i++ ){
//            for(int j = i+1; j<size; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        if(k == 0) {
//            return arr[size-1];
//        }
//        else if (k == 1) {
//            return arr[size-2];
//        }
}
