package sparseMatrix;

import java.util.ArrayList;

public class MySparseMatrix implements SparseMatrix {
    private int vLength; //vertical size (collums)
    private int hLength; //horizontal size
    private final Cell head;
    public MySparseMatrix() {
        this.vLength = 0;
        this.hLength = 0;
        this.head = new Cell(0,-1, -1);
        head.setNextDown(head);
        head.setNextRight(head);
    }
    private void addRight(Cell cell){ //tentar implementar metodo de goRight() passando vLength como parametro
        Cell aux = head;
        do{
            if(aux.getNextRight() == head){
                aux.setNextRight(cell);
                cell.setNextRight(head);
            }
            aux.setNextRight(aux.getNextRight());
        }while (aux.getNextRight()==head);
        aux.getNextRight().setNextRight(cell);
        cell.setNextDown(cell);
        cell.setNextRight(head);
    }
    private void addDown(Cell cell){ //tentar implementar metodo de goRight() passando hLength como parametro
        Cell aux = head;
        do {
            if(aux.getNextDown() == head) {
                aux.setNextDown(cell);
                cell.setNextDown(head);
            }
            aux.setNextDown(aux.getNextDown());
        }while (aux.getNextDown()==head);
        aux.getNextDown().setNextDown(cell);
        cell.setNextRight(cell);
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
    public void insert(int i, int j, float v){
        Cell cell = new Cell(v,i,j);
        if(getVLength() == 0 && gethLength() == 0){
            for(int k = 0; k < j; k++){ //Iterations to create the amout of grid lines
                Cell gridLine = new Cell(0,-1,0);
                addRight(gridLine);
                gridLine.setNextDown(null);
                vLength++;
            }
            for(int k = 0; k < i; k++){ //Iterations to create the amount of grid collums
                Cell gridCollum = new Cell(0,0,-1);
                addDown(gridCollum);
                gridCollum.setNextRight(null);
                hLength++;
            }
        }
    }
    @Override
    public void print() {
        Cell aux = head.getNextDown();
        for(int i = 0; i < hLength; i++){
            do{
                if(aux.getNextRight() == aux){
                    for(int j = 0; j < hLength; i++) {
                        System.out.println(0);
                    }
                    System.out.println();
                }
                else {
                    do {
                        int distance = aux.getNextRight().getCollum() - aux.getCollum();
                        for(int j = 0; j < distance - 1; j++) {
                            System.out.println(0);
                        }
                        System.out.print(aux.getValue());
                        if(aux.getCollum() != vLength && aux.getNextRight().getCollum() == -1) {
                            distance = vLength - aux.getCollum();
                            for (int j = 0; j < distance; j++) {
                                System.out.print(0);
                            }
                        aux = aux.getNextRight();
                        }
                    }while (aux.getLine() != -1);
                }
                aux = aux.getNextDown();
            }while (aux.getNextDown() != head);
        }
    }
    public void multiply(MySparseMatrix A, MySparseMatrix B){

    }
    public void read(){

    }


}
