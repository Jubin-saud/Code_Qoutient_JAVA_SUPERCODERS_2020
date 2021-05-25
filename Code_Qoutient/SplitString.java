package Code_Qoutient;

import java.util.Scanner;

public class SplitString
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] stringarray = s.split("[, - . ' / ]+");

        for(int i=0; i< stringarray.length; i++)
        {

            System.out.println(stringarray[i]);
        }
    }
}