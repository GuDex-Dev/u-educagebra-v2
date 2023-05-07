package Geometria.Clases;
import java.awt.Color;
import java.awt.Graphics;

public class Grafico {
    public static void dibujarLinea(Graphics g, Punto p1, Punto p2, Color col) {
        g.setColor(col);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }
    
    public static void dibujarCirculo(Graphics g, Punto centro, int radio , Color col) {
        g.setColor(col);
        g.drawOval(centro.x, centro.y, radio, radio);
    }
    
    public static void dibujarCuadrado(Graphics g, Punto centro, int lado , Color col) {
        g.setColor(col);
        g.drawRect(centro.x, centro.y, lado, lado);
    }
    
    public static void dibujarRectangulo(Graphics g, Punto centro, int base, int altura, Color col) {
        g.setColor(col);
        g.drawRect(centro.x, centro.y, base, altura);
    }
}