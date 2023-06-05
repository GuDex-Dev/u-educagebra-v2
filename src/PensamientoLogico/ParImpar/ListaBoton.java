package PensamientoLogico.ParImpar;

import javax.swing.JButton;

public class ListaBoton {
     public NodoBoton inicio=null, fin=null;
     
      public void InsertarNodo(JButton elemen) {
        NodoBoton nuevoBoton = new NodoBoton(elemen);
        if (inicio == null) {
                inicio = nuevoBoton;
                fin = nuevoBoton;
            } else {
                fin.siguiente = nuevoBoton;
                fin = nuevoBoton;
            }
    }
}
