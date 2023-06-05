package PensamientoLogico.ParImpar;
 
import javax.swing.JOptionPane;
 
public class ListaInt {

    public NodoInt inicio=null, fin=null;// protected es un modificador de acceso protegido
    int ran;
    public ListaInt() {

        for (int i = 1; i <= 9; i++) {
            ran= (int) (Math.random() * (50 - 1 + 1) + 1);
            NodoInt nuevoNodo = new NodoInt(ran);
            if (inicio == null) {
                inicio = nuevoNodo;
                fin = nuevoNodo;
            } else {
                fin.siguiente = nuevoNodo;
                fin = nuevoNodo;
            }
        }
    }
    public ListaInt(int elemen) {
        NodoInt nuevoNodo = new NodoInt(elemen);
        if (inicio == null) {
                inicio = nuevoNodo;
                fin = nuevoNodo;
            } else {
                fin.siguiente = nuevoNodo;
                fin = nuevoNodo;
            }
    }
}
