package sparseMatrix;

public interface SparseMatrix {
        void insert(int i, int j, float v);
        void multiply(MySparseMatrix A, MySparseMatrix B);
        void read();
        void print();
}
