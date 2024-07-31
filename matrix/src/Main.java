import java.sql.Array;
import java.sql.Struct;
import java.util.ArrayList;

public class Main {
    static class Matrix{
//        ArrayList<int[]> A;
        int[] A = new int[10];
        int n;
    };

    static void set(Matrix m, int row, int column, int elem) {
        if(row == column){
            // Only store the element if row and column are equal to each other.
            m.A[row -1] = elem;
        }
    }

    static int get(Matrix m, int i, int j) {
        return i==j ? m.A[i-1] : 0;
    }

    static void display(Matrix m){
        for(int i = 0; i < m.n; i++){
            for(int j = 0; j < m.n; j++){
                if(i==j){
                    System.out.printf("%d ",m.A[i]);
                }
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Matrix m = new Matrix();
        m.n = 5;

        set(m, 1, 1,5);
        set(m, 2, 2,9);
        set(m, 3, 3,12);
        set(m, 4, 4,15);
        set(m, 5, 5,10);

        display(m);

//        System.out.println(get(m,2,2));

    }

}