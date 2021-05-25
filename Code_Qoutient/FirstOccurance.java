package Code_Qoutient;

import java.util.Scanner;

public class FirstOccurance {

    public static void main(String args[])
    {
        boolean test = false;
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();
        for (int q =0; q< Testcase;q++){
            int num = sc.nextInt();
            int key = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0;
            for (i=0; i<num; i++){
                if (key == arr[i]){
                    System.out.println(i);
                    break;
                }
            }
            for (int element : arr) {
                if (element == key) {
                    test = true;
                    break;
                }
            }
            if(!test){
                System.out.println(-1);

            }
        }
    }
}
