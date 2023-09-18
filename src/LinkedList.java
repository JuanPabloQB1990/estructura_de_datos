public class LinkedList {

    class  Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }

    protected Node  head = null;
    protected Node tail = null;

    // [5] ->  next null  , head [5] tail [5]
    public void agregarHead(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null){
            tail = nuevoNodo;
        }
    }

    public void agregarTail(int valor) {
        Node nuevoNodo = new Node(valor);
        if (tail == null){
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }
}
