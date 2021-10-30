package proggy;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long terms = 1;
        long number = 1;

        for (int i = 1; i < 1000000; i++) {
            long num = i;
            long currentTerms = 1;

            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }
                currentTerms++;
            }

            if (currentTerms > terms) {
                terms = currentTerms;
                number = i;
            }

        }

        System.out.println(terms);
        System.out.println(number);

    }
}
