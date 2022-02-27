package softuniada2022;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        int nod = 0;
        int nok = 0;

        int smaller = 0;
        if (n < m) {
            smaller = n;
        } else {
            smaller = m;
        }

        for (int i = smaller; i > 0; i--) {
            if ((n % i == 0) && (m % i == 0)) {
                nod = i;
                break;
            }
        }

        int greater = 0;
        if (n > m) {
            greater = n;
        } else {
            greater = m;
        }

        for (int i = greater; i <= n * m; i++) {
            if ((i % n == 0) && (i % m == 0)) {
                nok = i;
                break;
            }
        }

        int sum = nod + nok;

        System.out.println(sum);

    }
}
