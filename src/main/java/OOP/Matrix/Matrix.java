package OOP.Matrix;

public class Matrix {
    private final int[][] matrix;
    private final int n_lines;
    private final int n_columns;
    public void setValues(int i, int j, int value){
        this.matrix[i][j] = value;
    }
    public int getValue(int i, int j){
        return this.matrix[i][j];
    }
    public int[][] getMatrix(){
        return this.matrix;
    }
    Matrix(int nl, int nc, int[][] m){
        this.n_lines = nl;
        this.n_columns = nc;
        this.matrix = m;
    }
    Matrix(int nl, int nc){
        this.n_lines = nl;
        this.n_columns = nc;
        this.matrix = new int[nl][nc];
    }
    Matrix(){
        this.n_lines = 0;
        this.n_columns = 0;
        this.matrix = new int[0][0];
    }
    public Matrix add_matrix(Matrix m2){
        Matrix m3 = new Matrix();
        Matrix m1 = this;
        if (m1.n_columns == m2.n_columns && m1.n_lines == m2.n_lines)
        {
            int lines = m1.n_lines;
            int columns = m1.n_columns;
            m3 = new Matrix(lines, columns);
            for (int i=0; i<lines; i++){
                for (int j=0; j<columns; j++){
                    m3.matrix[i][j] = m1.matrix[i][j]+m2.matrix[i][j];
                }
            }
        }
        else
        {
            System.err.println("Невозможно сложить матрицы разных размеров");
        }
        return m3;
    }
    public Matrix multiply_by_number(int n){
        Matrix m1 = this;
        Matrix m2 = new Matrix(m1.n_lines, m1.n_columns);
            for (int i=0; i<m1.n_lines; i++){
                for (int j=0; j<m1.n_columns; j++){
                    m2.matrix[i][j] = m1.matrix[i][j]*n;
                }
            }
        return m2;
    }
    public void print(){
        for (int i=0; i<this.n_lines; i++){
            for (int j=0; j<this.n_columns; j++){
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
       }
    }
    public Matrix multiply_by_matrix(Matrix m1){
        Matrix m3 = new Matrix();
        if (this.n_columns == m1.n_lines && this.n_lines == m1.n_columns)
        {
            int lines = m1.n_lines;
            int columns = this.n_columns;
            m3 = new Matrix(lines, columns);
            for (int i=0; i<lines; i++){
                for (int j=0; j<columns; j++){
                    for (int n=0; n<this.n_lines; n++)
                        m3.matrix[i][j] += this.matrix[n][j]*m1.matrix[i][n];
                }
            }
        }
        else
        {
            System.err.println("Невозможно перемножить матрицы");
        }
        return m3;
    }
}