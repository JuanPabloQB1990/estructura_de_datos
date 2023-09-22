package Ejercicio_Linkedlist;

public class Main {
    public static void main(String[] args) {
        SolicitudesLinkedList solicitudes = new SolicitudesLinkedList();
        solicitudes.agregarSolicitudPersona("Juan");
        solicitudes.agregarSolicitudPersona("Pedro");
        solicitudes.imprimirSolicitudes();
    }
}
