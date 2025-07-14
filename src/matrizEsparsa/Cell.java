package matrizEsparsa;

public class Cell<T>{
    T value;
    Cell<T> nextRight;
    Cell<T> nextDown;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNextRight(Cell<T> nextRight) {
        this.nextRight = nextRight;
    }
    public void setNextDown(Cell<T> nextDown){
        this.nextDown = nextDown;
    }

    public Cell(T value){
        this.value = value;
        this.nextRight = null;
        this.nextDown = null;
    }

    public Cell<T> getNextRight() { //throws NullPointerException
        return nextRight;
    }

    public Cell<T> getNextDown(){ //throws NullPointerException
        return nextDown;
    }

    public T getValue() {
        return value;
    }
}
