package softuniada2022;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeCups {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int n = Integer.parseInt(scan.nextLine());
        String sign = scan.nextLine();

        sign = sign.toUpperCase(Locale.ROOT);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("~ ");
            }
            System.out.println();
        }

        for (int i = 1; i < 3 * n + 6; i++) {
            System.out.print("=");
        }
        System.out.println();

        //--------------------------
        
        int k = 3 + (n - 1);

        for (int i = n - 2; i > 0; i--) {
            System.out.print("|");
            if (i == n / 2 && n % 2 !=0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("~");
                }
                System.out.print(sign);
                for (int j = 0; j < n; j++) {
                    System.out.print("~");
                }
                System.out.print("|");

                for (int j = 1; j < n; j++) {
                    System.out.print(" ");
                }

                System.out.print("|");
                System.out.println();
                continue;
            }

            if (i == n / 2 -1 && n % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("~");
                }
                System.out.print(sign);
                for (int j = 0; j < n; j++) {
                    System.out.print("~");
                }
                System.out.print("|");

                for (int j = 1; j < n; j++) {
                    System.out.print(" ");
                }

                System.out.print("|");
                System.out.println();
                continue;
            }

            for (int j = 1; j <= (3 * n + 6) - k; j++) {
                System.out.print("~");
            }

            System.out.print("|");

            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }

            System.out.print("|");

            System.out.println();
        }

//        System.out.print("|");

//        for (int i = 0; i < n; i++) {
//            System.out.print("~");
//        }
//
//        //System.out.print("JAVA");
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("~");
//        }
//
//        System.out.print("|");
//
//        for (int i = 1; i < n; i++) {
//            System.out.print(" ");
//        }
//
//        System.out.print("|");
//        System.out.println();

        //----------------

        for (int i = 1; i < 3 * n + 6; i++) {
            System.out.print("=");
        }
        System.out.println();

        int p = 6;

        for (int i = 1; i < n; i++) {
            p += 2;
        }


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("\\");

            for (int j = 0; j < p; j++) {
                System.out.print("@");
            }
            p -= 2;

            System.out.print("/");
            System.out.println();
        }

        for (int i = 1; i < 3 * n + 6; i++) {
            System.out.print("-");
        }

    }
}
