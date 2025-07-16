package sparseMatrix;

public class Cell {
    private float value;
    private int line;
    private int collum;
    private Cell nextRight;
    private Cell nextDown;

    public Cell(float value, int line, int collum){
        this.value = value;
        this.nextRight = null;
        this.nextDown = null;
        this.line = line;
        this.collum = collum;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setNextRight(Cell nextRight) {
        this.nextRight = nextRight;
    }
    public void setNextDown(Cell nextDown){
        this.nextDown = nextDown;
    }

    public Cell getNextRight() { //throws NullPointerException
        return nextRight;
    }

    public Cell getNextDown(){ //throws NullPointerException
        return nextDown;
    }

    public int getLine() {
        return line;
    }

    public int getCollum() {
        return collum;
    }

    public float getValue() {
        return value;
    }
}
