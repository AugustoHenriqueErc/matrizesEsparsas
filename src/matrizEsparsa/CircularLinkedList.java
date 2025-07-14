package matrizEsparsa;

public class CircularLinkedList<T> {
    private Cell<T> tail;
    private Cell<T> head;
    public CircularLinkedList()
    {
        tail = null;
        head = null;
    }

    public void insertFirst(T value){
        this.insertFirst(new Cell<T>(value));
    }
    private void insertFirst(Cell<T> cell){
        if(tail == null||head == null)
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else {
            cell.setNext(head);
            head = cell;
            tail.setNext(cell);
        }
    }

    public void insertEnd(T value)
    {
        this.insertEnd(new Cell<T>(value));
    }

    private void insertEnd(Cell<T> cell)
    {
        if((tail == null||head == null))
        {
            tail = cell;
            head = cell;
            tail.setNext(cell);
        }
        else
        {
            tail.setNext(cell);
            cell.setNext(head);
            tail = cell;
        }
    }
    public void remove(T value)
    {

    }

    public Cell<T> search(T value)
    {
        Cell<T> aux = tail.getNext();
        while(aux != null)
        {
            if(aux.getValue() == value) return aux;
        }
        return null;
    }

    @Override
    public String toString()
    {
        Cell<T> aux = head;
        StringBuilder sb = new StringBuilder();
        do
        {
            sb.append(aux.getValue()).append(", ");
            aux = aux.getNext();
        }while (aux != head);
        return sb.toString();
    }

}