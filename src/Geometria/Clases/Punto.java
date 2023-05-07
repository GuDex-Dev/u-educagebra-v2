package Geometria.Clases;

public class Punto {
    public int x;
    public int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public void definirCoord(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double dist(Punto p) {
        double dist;
        dist = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
        dist = Math.round(dist*100.0)/100.0;
        return dist;
    }
}
