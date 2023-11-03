import java.util.*;

class Matrix{
    int [][]mat;
    int row;
    int col;

    Matrix(int r,int c)
    {
        row=r;
        col=c;
        mat = new int[row][col];
    }

    void insert()
    {
        System.out.println("Enter elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix transpose() {
        Matrix T = new Matrix(col, row);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                T.mat[j][i] = mat[i][j];
            }
        }
        System.out.println("Transpose:");
        return T;
    }

    int max() {
        int max = mat[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    void principal_diagonal() {
        System.out.print("The principal diagonal elements are:");
        for (int i = 0; i < row; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
    }

    public void non_diagonal() {
        System.out.print("The non-diagonal elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
public class Q2{
    public static void main(String[] args) throws Exception {
        Matrix m = new Matrix(3, 3);
        m.insert();
        Thread t1 = new Thread(() -> m.display());
        Thread t2 = new Thread(() -> m.transpose().display());
        Thread t3 = new Thread(() -> System.out.println("The maximum value in the matrix is: " + m.max()));
        Thread t4 = new Thread(() -> m.principal_diagonal());
        Thread t5 = new Thread(() -> m.non_diagonal());
        //t1.start(); 
        if (t1.isAlive()) {
            System.out.println("Thread 1 is still running");
        }
        else
        {
            System.out.println("Thread is dead");
        }

        try {
            t1.start(); 
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
            t5.start();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads have finished");
    }
}