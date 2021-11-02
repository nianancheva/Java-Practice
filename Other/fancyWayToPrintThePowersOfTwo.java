import java.util.Scanner;

public class fancyWayToPrintThePowersOfTwo {
    public static void main(String[] args) {

        //sorry for the long name of the class lol

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //n --> the highest power of 2 we want to get
        //would probably crash if n > 60

        long x = 1;
        long y = 0;

        for (int i = 0; i <= n; i++) {
            y = x + y;
            x = y;
            System.out.printf("%dth Power of 2: %d%n", i, x);
        }
    }
}
