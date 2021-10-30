import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long sumSquares = 0;
        long sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumSquares = sumSquares + (i * i);
            sum += i;
        }

        long squareSum = sum * sum;

        long diff = squareSum - sumSquares;

        System.out.println(diff);
    }
}
