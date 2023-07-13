package OOP.Matrix;

import junit.framework.TestCase;

public class MatrixTest extends TestCase {

    public void testSetValues() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        Matrix m = new Matrix(2,3, matrix);
        m.setValues(1,1,5);
        assertEquals(5,m.getValue(1,1));
    }

    public void testAdd_matrix() {
        int[][] matrix = {{1,2},{4,5}};
        int[][] matrix1 = {{2,1},{1,1}};
        Matrix p = new Matrix(2,2, matrix);
        Matrix p1 = new Matrix(2,2, matrix1);
        p = p.add_matrix(p1);
        int[][] matrix2 = {{3,3},{5,6}};
        for (int i = 0; i<2; i++)
            for (int j = 0; j<2; j++)
                assertEquals(matrix2[i][j],p.getMatrix()[i][j]);
    }

    public void testMultiply_by_number() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        Matrix p = new Matrix(2,3, matrix);
        int[][] matrix1 = {{2,4,6},{8,10,12}};
        p = p.multiply_by_number(2);
        for (int i = 0; i<2; i++)
            for (int j = 0; j<2; j++)
                assertEquals(matrix1[i][j],p.getMatrix()[i][j]);
    }

    public void testMultiply_by_matrix() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix1 = {{2,1},{1,1},{2,2}};
        Matrix p = new Matrix(2,3, matrix);
        Matrix p1 = new Matrix(3,2, matrix1);
        p1 = p1.multiply_by_matrix( p);
        int[][] matrix3 = {{10,9},{25,21}};
        for (int i = 0; i<2; i++)
            for (int j = 0; j<2; j++)
                assertEquals(matrix3[i][j],p1.getMatrix()[i][j]);
    }
}