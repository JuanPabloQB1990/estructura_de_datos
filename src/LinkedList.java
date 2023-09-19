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

    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarHead(valor);
        }else {
            Node node = new Node(valor);
            Node actual = head;
            for (int i= 0; i < posicion-1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            //[0] -> [3] -> [5] -> [10]
            if(actual.next == null) {
                agregarTail(valor);
            } else {
                //[0] -> [3] -> [99]->[5]  -> [10]
                node.next = actual.next;
                actual.next = node;
            }
        }
    }
}
