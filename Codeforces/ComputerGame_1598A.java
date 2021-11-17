import java.util.Scanner;

public class ComputerGame_1598A {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int testCases = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < testCases; i++) {
            int columns = Integer.parseInt(scan.nextLine());
            char[][] matrix = new char[2][columns];

            for (int r = 0; r < matrix.length; r++) {
                char[] line = scan.nextLine().toCharArray();
                matrix[r] = line;
            }

            printMatrix(matrix);
        }


    }

    static void printMatrix (char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
