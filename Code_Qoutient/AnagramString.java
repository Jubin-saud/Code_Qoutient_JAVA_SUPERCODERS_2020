package Code_Qoutient;

import java.util.Scanner;

public class AnagramString {
    public static int isAnagram(String word, String anagram) {
        if (word.length() != anagram.length())
            return 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else
                return 0;
        }
        return 1;
    }
//    static int isAnagram(String s1, String s2) {
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//
//        if (s1.length() == s2.length()){
//            char[] charArray1 = s1.toCharArray();
//            char[] charArray2 = s2.toCharArray();
//            Arrays.sort(charArray1);
//            Arrays.sort(charArray2);
//
//            boolean res = Arrays.equals(charArray1,charArray2);
//
//            if(res){
//                return 1;
//            }
//        }
//        return  0;
//    }

    public static void main(String[] args) {
        String a = null, b = null;
        Scanner sc = new Scanner(System.in);
        int Testcase = sc.nextInt();            //test cases
        for (int q = 0; q < Testcase; q++) {
            a = sc.next();
            b = sc.next();

            if (isAnagram(a, b) !=0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
