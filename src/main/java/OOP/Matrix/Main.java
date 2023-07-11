package OOP.Matrix;

import OOP.Phone.Phone;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix1 = {{2,1},{1,1},{2,2}};
        Matrix p = new Matrix(2,3, matrix);
        Matrix p1 = new Matrix(3,2, matrix1);
        p.print();
        System.out.println(" * ");
        p1.print();
        p1 = p1.multiply_by_matrix( p);
        System.out.println(" = ");
        p1.print();
    }
}