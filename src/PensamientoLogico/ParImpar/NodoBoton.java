package PensamientoLogico.ParImpar;

import javax.swing.JButton;

public class NodoBoton {
    public JButton dato;
    public NodoBoton ok;
    public NodoBoton siguiente;
    
    public NodoBoton (JButton d){
        this.dato=d;
        
    }
    public NodoBoton (NodoBoton d){
        this.ok=d;
        
    }
    public NodoBoton(JButton d,NodoBoton n){
        this.dato=d;
        this.siguiente=n;
    }
}
