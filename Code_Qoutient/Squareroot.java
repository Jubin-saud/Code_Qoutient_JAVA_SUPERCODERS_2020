package Codeqoutient;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double a,b;
        int n,i;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        for (i=1;i<n;i++){
            a = scanner.nextDouble();
            b=Math.sqrt(a);
            System.out.println(df.format(b));
        }

        ;
//        DecimalFormat df = new DecimalFormat("#.00");
//
//        try (Scanner scanner = new Scanner(System.in)) {
//            IntStream.range(0, scanner.nextInt())
//                    .map(i -> scanner.nextInt())
//                    .mapToDouble(Math::sqrt)
//                    .boxed()
//                    .forEach(aDouble -> System.out.println(df.format(aDouble)+"\n"));
//
//        }
    }
}
