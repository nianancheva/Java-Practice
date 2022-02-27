package softuniada2022;

import java.util.Scanner;

public class SpiralMAtr {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int matrix[][]= new int[r][c];
        int row = matrix.length-1;
        int col = 0;
        int p1 = 0;
        int p2 = matrix[0].length-1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        while(p1 <= row && col <= p2){
            for (int i = p1; i <= p2; i++) {
                System.out.print(matrix[p1][i] + " ");
            }
            for (int i = p1+1; i <= row; i++) {
                System.out.print(matrix[i][p2] + " ");
            }
            if(p1+1 <= row){
                for (int i = p2-1; i >= col; i--) {
                    System.out.print(matrix[row][i] + " ");
                }
            }
            if(col+1 <= p2){
                for (int i = row-1; i > p1; i--) {
                    System.out.print(matrix[i][col] + " ");
                }
            }
            p1++;
            row--;
            col++;
            p2--;
        }
        
    }
}
