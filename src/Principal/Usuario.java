package Principal;

public class Usuario {
    
    //Info Personal
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String grado;
    public Boolean existo;
    public String iniciales;
    
    
    //Estadísticas
    private int bits;
    private int opCorrectas;
    private int opIncorrectas;
    private int opTotales;
    private int porcentAcierto;
    private int nivel;
    
    //Borré un icono v.
    
    public Usuario() {
        existo = false;
    }
    
    public Usuario(String nombre, String apellido, int edad, String sexo, String grado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.grado = grado;
        this.bits = 0;
        this.opCorrectas = 0;
        this.opIncorrectas = 0;
        this.opTotales = 0;
        this.porcentAcierto = 0;
        this.nivel = 1;
        this.existo = true;
        
        this.iniciales= this.nombre.substring(0,1)+this.apellido.substring(0,1);
    }
    
    public void ActualizarRelat() {
        this.opTotales = opCorrectas + opIncorrectas;
        this.porcentAcierto = opCorrectas*100/opTotales;
    }
    
    public void OpCorrecta() {
        this.bits += 5;
        this.opCorrectas += 1;
        ActualizarRelat();
    }
    
    public void OpIncorrecta() {
        this.bits -= 3;
        this.opIncorrectas += 1;
        ActualizarRelat();
    }

    public int getBits() {
        return bits;
    }   

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
