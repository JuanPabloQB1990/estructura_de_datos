package LinkedList;

import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.agregarHead(5);
        linkedList.agregarHead(3);
        linkedList.agregarHead(20);
        linkedList.agregarTail(10);
        linkedList.agregarTail(101);
        linkedList.agregarPorPosicion(2, 99);
        linkedList.imprimirLinkedList();
        linkedList.buscarPorPosicion(2);
        linkedList.buscarValor(3);

        linkedList.reemplazarNodo(3,100);
        linkedList.imprimirLinkedList();
        //linkedList.eliminarPorPosicion(3);
        linkedList.imprimirLinkedList();
        linkedList.eliminarHead();
        linkedList.eliminarTail();
        System.out.println("linkedlist sin head y sin tail");
        linkedList.imprimirLinkedList();

    }
    // [7] -> [6] -> [5]
    // [7] -> [0] -> [5] -> [10]
    // [7] -> [0] -> [1] ->  [5] -> [10]
    // [7] -> [0] -> [1] ->  [5] -> [10] -> [6] -> [8]
    // [7] -> [0] -> [1] ->  [5] -> [10] -> [8] ->  [6] -> [8]
     //agrege un nodo en la posicion  = 5;
    // head                 //tail
}