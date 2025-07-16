package sparseMatrix;

import java.util.ArrayList;

public class MySparseMatrix implements SparseMatrix {
    private int vLength; //vertical size (collums)
    private int hLength; //horizontal size
    private Cell head;
    public MySparseMatrix() {
        this.vLength = 0;
        this.hLength = 0;
        this.head = new Cell(0,-1, -1);
    }
    private void addRight(Cell cell){ //tentar implementar metodo de goRight() passando vLength como parametro
        Cell aux = head;
        do{
            aux.setNextRight(aux.getNextRight());
        }while (aux.getNextRight()==head);
        aux.getNextRight().setNextRight(cell);
        cell.setNextRight(head);
    }
    private void addDown(Cell cell){ //tentar implementar metodo de goRight() passando hLength como parametro
        Cell aux = head;
        do {
            aux.setNextDown(aux.getNextDown());
        }while (aux.getNextDown()==head);
        aux.getNextDown().setNextDown(cell);
        aux.setNextDown(head);
    }

    private Cell goRight(int distance) { //throws NullPointerException caso distance seja 0
        Cell aux = head;
        for(int i = 0; i < distance; i++){
            aux = aux.getNextRight();
        }
        return aux;
    }

    private Cell goDown(int distance) { //throws NullPointerException caso distance seja 0
        Cell aux = head;
        for(int i = 0; i < distance; i++){
            aux = aux.getNextDown();
        }
        return aux;
    }

    private int getVLength(){
        return vLength;
    }
    private int gethLength(){
        return hLength;
    }
    //i = vertical position;
    // j = horizontal position;
    public void insert(float v, int i, int j){
        Cell cell = new Cell(v,i,j);
        if(getVLength() == 0 && gethLength() == 0){
            for(int k = 0; k < j; k++){ //Iterations to create the amout of grid lines

                vLength++;
            }
            for(int k = 0; k < i; k++){ //Iterations to create the amount of grid collums

                hLength++;
            }
        }
    }
    @Override
    public void print() {
        for(int = 0)
    }
    public void multiply(MySparseMatrix A, MySparseMatrix B){

    }
    public void read(){

    }


}
