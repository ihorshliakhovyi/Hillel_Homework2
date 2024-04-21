package Lesson2;

public class Lesson2_Matrix {
    public static void main(String[] args) {
        int [] [] matrix = new int[2][3];
        matrix[0][1] = 6;
        matrix[0][0] = 1;
        matrix[0][2] = 2;
        matrix[1][0] = 11;
        matrix[1][1] = 111;
        matrix[1][2] = 22;


        System.out.println(matrix);
        int [][] matrix2 = new int [][]{{1,2,3},{1,5,6},{2,5,7}};
        System.out.println(matrix2.length);
    }
}
