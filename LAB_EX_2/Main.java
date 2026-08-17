/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter rows and cols for Matrix A: ");
            int rA = sc.nextInt(), cA = sc.nextInt();
            int[][] A = new int[rA][cA];
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rA; i++)
                for (int j = 0; j < cA; j++)
                    A[i][j] = sc.nextInt();

            System.out.print("Enter rows and cols for Matrix B: ");
            int rB = sc.nextInt(), cB = sc.nextInt();
            int[][] B = new int[rB][cB];
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rB; i++)
                for (int j = 0; j < cB; j++)
                    B[i][j] = sc.nextInt();

            int[][] result = Problem2_MatrixMultiplication.multiplyMatrices(A, B);

            System.out.println("Resulting Matrix:");
            for (int[] row : result)
                System.out.println(Arrays.toString(row));

        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}