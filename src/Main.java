public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.agregarHead(5);
        linkedList.agregarHead(6);
        linkedList.agregarHead(7);
        linkedList.agregarHead(5);
        linkedList.agregarHead(6);
        linkedList.agregarHead(7);
        linkedList.agregarHead(5);
        linkedList.agregarHead(6);
        linkedList.agregarHead(7);
        linkedList.agregarTail(10);
    }
    // [7] -> [6] -> [5]
    // [7] -> [0] -> [5] -> [10]
    // [7] -> [0] -> [1] ->  [5] -> [10]
    // [7] -> [0] -> [1] ->  [5] -> [10] -> [6] -> [8]
    // [7] -> [0] -> [1] ->  [5] -> [10] -> [8] ->  [6] -> [8]
     //agrege un nodo en la posicion  = 5;
    // head                 //tail
}