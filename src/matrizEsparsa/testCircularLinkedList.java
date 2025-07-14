package matrizEsparsa;

public class testCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        list.insertFirst(10);
        list.insertFirst(5);
        list.insertEnd(20);

        System.out.println("Print Lista");
        System.out.println(list.toString());

        System.out.print("Procurando elemento 5:");
        System.out.println(list.search(5));

        }
}

