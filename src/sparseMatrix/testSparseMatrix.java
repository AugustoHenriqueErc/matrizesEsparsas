package sparseMatrix;

public class testSparseMatrix {
    public static void main(String[] args) {
        SparseMatrix sm = new MySparseMatrix();
        System.out.println("Verificando inserção no final(caso 1):");
        sm.insert(10, 10,10);
        sm.print();
        System.out.println("Verificando inserção no meio:");
        sm.insert (5,5,5);
        sm.print();
    }
}
