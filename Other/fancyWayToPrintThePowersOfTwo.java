import java.util.Scanner;

public class fancyWayToPrintThePowersOfTwo {

    public static void main(String[] args) {
      
      // sorry for the long name of the class lol

        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
       // would probably crash if n > 30
        
        int x = 1;
        int y = 0;

        for (int i = 0; i <= n; i++) {
            y = x + y;
            x = y;
            System.out.printf("%dth Power of 2: %d%n", i, x);
        }

    }
}
