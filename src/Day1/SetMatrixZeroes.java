package Day1;

import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++)
                matrix[i][j] = sc.nextInt();
        }
        setMatrixZeroes(matrix);

    }


public static void setMatrixZeroes(int[][] matrix){
    //BF: traverse the main array and if matrix[i][j] ==0, fill the ith row and jth col of copy matrix with 0;
    // after traversing the original matrix, copy the values from copy matrix to original matrix

    //optimised approach: use two boolean arrays to store the rows and cols which needs to be filled with zeroes
    int n = matrix.length;
    int m = matrix[0].length;
    boolean[] row = new boolean[n];
    boolean[] col = new boolean[m];

    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(matrix[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
        }
    }

    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(row[i] || col[j])
                matrix[i][j] =0;
        }
    }

    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

    }

}
