package Geometria.Clases;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private double ang1;
    private double ang2;
    private double ang3;
    
    public Triangulo() {
        this.lado1 = 0;
        this.lado2 = 0;
        this.lado3 = 0;
        this.ang1 = 0;
        this.ang2 = 0;
        this.ang3 = 0;
    }
    
    public void limpiarEdit() {
        this.lado2 = 0;
        this.lado3 = 0;
        this.ang2 = 0;
        this.ang3 = 0;
    }
    
    public double per() {
        double p = 0;
        p = Math.round((this.lado1 + this.lado2 + this.lado3)*100);
        p = p/100;
        return p;
    }
    
    public double altura() {
        double alt = 0;
        alt = this.lado1 * Math.sin(Math.toRadians(this.ang1));
        alt = Math.round(alt*100);
        alt = alt/100;
        return alt;
    }
    
    public double area() {
        double area = 0;
        double sp = 0;
        sp = (this.lado1 + this.lado2 + this.lado3)/2;
        area = Math.sqrt(sp*(sp-this.lado1)*(sp-this.lado2)*(sp-this.lado3));
        area = Math.round(area*100);
        area = area/100;
        return area;
    }    

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = Math.round(lado1*100);
        this.lado1 = this.lado1/100;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = Math.round(lado2*100);
        this.lado2 = this.lado2/100;
    }

    public double getLado3() {
        return this.lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = Math.round(lado3*100);
        this.lado3 = this.lado3/100;
    }

    public double getAng1() {
        return this.ang1;
    }

    public void setAng1(double ang1) {
        this.ang1 = Math.round(ang1*100);
        this.ang1 = this.ang1/100;
    }

    public double getAng2() {
        return this.ang2;
    }

    public void setAng2(double ang2) {
        this.ang2 = Math.round(ang2*100);
        this.ang2 = this.ang2/100;
    }

    public double getAng3() {
        return this.ang3;
    }

    public void setAng3(double ang3) {
        this.ang3 = Math.round(ang3*100);
        this.ang3 = this.ang3/100;
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", ang1=" + ang1 + ", ang2=" + ang2 + ", ang3=" + ang3 + '}';
    }
}
