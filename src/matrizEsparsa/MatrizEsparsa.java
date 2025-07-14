package matrizEsparsa;

public interface MatrizEsparsa {
    void insert(int i, int j, double v);
    void multiply(MinhaMatrizEsparsa A, MinhaMatrizEsparsa B);
    void read();
    void print();
}
