package Code_Qoutient;

class StrRotation {
    static boolean checkRotation(String s1, String s2) {
        /* Comparing and checking string lengths */
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1; //storing concatenated string

        if (temp.contains(s2)) {
            return true; //returning true if 2nd string is present in concatenated string
        } else {
            return false;
        }

    }

    // Driver code
    public static void main(String[] args) {
        String a = "HELLO";
        String b = "LOHEL";

        if (checkRotation(a, b))
            System.out.println("Given Strings are rotations of each other.");
        else
            System.out.println("Given Strings are not rotations of each other.");
    }
}
