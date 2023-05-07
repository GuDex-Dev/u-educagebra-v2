package Geometria.Clases;

public class Rectangulo {
    private int base;
    private int altura;
    private int perimetro;
    private int area;
    
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
        this.perimetro = 0;
        this.area = 0;
    }
    
    public int area() {
        this.area = this.base * this.altura;
        return this.area;
    }
    
    public int per() {
        this.perimetro = 2 * (this.base + this.altura);
        return this.perimetro;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }    
}
