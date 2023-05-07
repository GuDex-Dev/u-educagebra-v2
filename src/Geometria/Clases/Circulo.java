/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria.Clases;

public class Circulo {
    private double radio;
    private double diametro;
    private double area;
    private double perimetro;
    
    public Circulo() {
        this.radio = 0;
        this.diametro = 0;
        this.area = 0;
        this.perimetro = 0;
    }
    
    public double diametro() {
        this.diametro = this.radio * 2;
        return this.diametro;
    }
    
    public double area() {
        this.area = Math.PI * Math.pow(this.radio, 2);
        this.area = Math.round(this.area*100);
        this.area /= 100;
        return this.area;
    }
    
    public double per() {
        this.perimetro = 2 * Math.PI * this.radio;
        this.perimetro = Math.round(this.perimetro*100);
        this.perimetro /= 100;
        return this.perimetro;
    }
    
    public double diamToRadio() {
        this.radio = this.diametro/2;
        return this.radio;
    }
    
    public double areaToRadio() {
        this.radio = Math.sqrt(this.area / Math.PI);
        return this.radio;
    }
    
    public double perToRadio() {
        this.radio = this.perimetro / (2 * Math.PI);
        return this.radio;
    }

    //
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
