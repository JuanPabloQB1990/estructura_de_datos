package LinkedList;

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
        } else {
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

    // buscar por posicion
    public void buscarPorPosicion(int pos){
        int currentPos = 0;
        Node actual = head;
        for (int i = 0; i < pos-1; i++) {
            if (actual.next != null){
                currentPos += 1;
                actual = actual.next;
            }
        }

        System.out.println("el valor del nodo en la posicion "+ pos +" es "+ actual.value);
    }

    // eliminar por posicion
    public void eliminarPorPosicion(int pos){
        int currentPos = 1;
        Node actual = head;
        Node actualAEliminar = null;
        for (int i = 0; i < pos-1; i++) {
            if (actual.next != null && currentPos == pos-1){
                actualAEliminar = actual.next;
                actual.next = actualAEliminar.next;
            } else {
                currentPos += 1;
                actual = actual.next;
            }
        }

    }

    // contiene valor
    public void buscarValor(int valorABuscar){
        int currentNode = 1;
        Node actual = head;
        while(actual.value != valorABuscar){
            currentNode += 1;
            actual = actual.next;
        }
        System.out.println("el valor "+valorABuscar+ " si se encuentra en el linkedList, y esta en la posicion "+currentNode);

    }

    // reemplazar nodo => la misma logica de anadir en un indice indicado
    public void reemplazarNodo(int pos, int valor){
        Node actual = head;
        Node nuevoNodo = new Node(valor);
        int currentPos = 1;
        Node nodoAReemplazar = null;
        for (int i = 0; i < pos-1; i++) {
            if (currentPos == pos-1){
                nodoAReemplazar = actual.next;
                nuevoNodo.next = nodoAReemplazar.next;
                actual.next = nuevoNodo;
            }else{
                actual = actual.next;
                currentPos += 1;
            }
        }
    }


    // recorrer imprimir todo
    public void imprimirLinkedList(){
        Node actual = head;
        int currentPos = 1;
        String cabeza = "Head";
        String cola = "Tail";
        while(actual != null){
            System.out.println("Nodo: "+currentPos+" " +((actual == head)?cabeza : (actual == tail)?cola:"    ")+" => value: "+actual.value + " => next: "+ ((actual.next != null) ? actual.next.value : null));
            actual = actual.next;
            currentPos += 1;
        }
    }












    // eliminar al inicio
    public void eliminarHead(){
        if (head != null){
            head = head.next;
        }else{
            System.out.println("no hay nodos en la lista");

        }
    }
    // eliminar al final
    public void eliminarTail() {
        if (tail != null){
            Node actual = head;
            if (actual != tail){
                while(actual.next != tail){
                    actual = actual.next;
                }
                actual.next = null;
                tail = actual;
            }else{
                head = null;
                tail = null;
            }

        } else {
            System.out.println("no hay nodos en la lista");

        }
    }
}
