package Geometria.Clases;

public class Cuadrado {
    private int lado;
    private int perimetro;
    private int area;
    
    public Cuadrado() {
        this.lado = 0;
        this.perimetro = 0;
        this.area = 0;
    }
    
    public int area() {
        this.area = (int) Math.pow(this.lado, 2);
        return this.area;
    }
    
    public int per() {
        this.perimetro = this.lado*4;
        return this.perimetro;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
}
