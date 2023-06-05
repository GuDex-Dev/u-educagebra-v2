package PensamientoLogico.ParImpar;
 
public class NodoInt {
    public int dato;
    public NodoInt siguiente;
    
    public NodoInt (int d){
        this.dato=d;
        
    }
    public NodoInt(int d,NodoInt n){
        dato=d;
        siguiente=n;
    }
}
