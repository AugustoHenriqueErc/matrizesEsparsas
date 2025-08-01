package sparseMatrix;

public class MySparseMatrix implements SparseMatrix {
    private int nlines; //vertical size (collums)
    private int nCollums; //horizontal size
    private final Cell head;
    public MySparseMatrix() {
        this.nlines = 0;
        this.nCollums = 0;
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
        return nlines;
    }
    private int getnCollums(){
        return nCollums;
    }
    //i = vertical position;
    // j = horizontal position;
    public void insert(int i, int j, float v){
        Cell cell = new Cell(v,i,j);
        if(getVLength() == 0 && getnCollums() == 0){
            for(int k = 0; k < j; k++){ //Iterations to create the amout of grid lines
                Cell gridLine = new Cell(0,-1,0);
                addRight(gridLine);
                gridLine.setNextDown(null);
                nlines++;
            }
            for(int k = 0; k < i; k++){ //Iterations to create the amount of grid collums
                Cell gridCollum = new Cell(0,0,-1);
                addDown(gridCollum);
                gridCollum.setNextRight(null);
                nCollums++;
            }
        }
    }
    @Override
    public void print() {
        /*
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
         */
        Cell aux = head;
        for(int i = 0; i < nlines; i++){
            System.out.println(); //pula a linha e itera a próxima célula de baixo
            aux = aux.getNextDown(); //
            for(int j = 0; j < nCollums;j++) {
                aux = aux.getNextRight();
                if(aux.getCollum() == j + 1) {
                    System.out.print(aux.getValue());
                }
                else { // Caso o número da coluna da célula seja maior cria um for para veriifcar quantos '0' printar
                    for(int k = 0; k < aux.getLine() - j;k++) {
                        System.out.println(0);
                    }
                }
            }
        }
    }
    public void multiply(MySparseMatrix A, MySparseMatrix B){

    }
    public void read(){

    }


}
