package Code_Qoutient;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //array size
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int[] arr, int n){
        boolean[] searched = new boolean[n];

        Arrays.fill(searched, false);

        for(int i =0;i<n;i++){
            if(searched[i])
                continue;

            int count = 1;
            for(int j =i+1; j<n; j++){
                if(arr[i] == arr[j]) {
                    searched[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "occurs" + count +" times");

        }
    }
}
