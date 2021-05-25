package Code_Qoutient;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)){
            System.out.println("Equal");
        }
        else if(a.length() < b.length()){
            System.out.println("Small");
        }
        else {
            System.out.println("Large");
        }
    }
}
