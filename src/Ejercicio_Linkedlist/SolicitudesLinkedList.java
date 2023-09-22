package Ejercicio_Linkedlist;

import LinkedList.LinkedList;

public class SolicitudesLinkedList {
    class NodeSolicitudes {
        String nombrePersona;
        NodeSolicitudes next = null;

        public NodeSolicitudes(String nombrePersona){
            this.nombrePersona = nombrePersona;
        }

    }

    protected NodeSolicitudes head = null;
    protected NodeSolicitudes tail = null;

    public void agregarSolicitudPersona(String nombre){
        NodeSolicitudes newNode = new NodeSolicitudes(nombre);
        if (tail == null){
            tail = newNode;
            head = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void imprimirSolicitudes(){
        NodeSolicitudes actual = head;
        int currentPos = 1;
        String cabeza = "Head";
        String cola = "Tail";
        while(actual != null){
            System.out.println("Nodo: "+currentPos+" " +((actual == head)?cabeza : (actual == tail)?cola:"    ")+" => value: "+actual.nombrePersona + " => next: "+ ((actual.next != null) ? actual.next.nombrePersona : null));
            actual = actual.next;
            currentPos += 1;
        }
    }



}
