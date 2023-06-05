package Principal.Clases;

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
        //ControladorDatos.Datos.guardarPerfiles();
    }
    
    public void ActualizarRelat() {
        this.opTotales = opCorrectas + opIncorrectas;
        this.porcentAcierto = opCorrectas*100/opTotales;
        ControladorDatos.Datos.guardarPerfiles();
    }
    
    public void OpCorrecta() {
        this.bits += 5;
        this.opCorrectas += 1;
        ActualizarRelat();
        nivel=(opCorrectas/8)+1;
        System.out.println(nivel);
    }
    
    public void OpIncorrecta() {
        this.bits -= 3;
        this.opIncorrectas += 1;
        ActualizarRelat();
    }

    public int getBits() {
        return bits;
    }   

    public void setBits(int bits) {
        this.bits = bits;
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Boolean getExisto() {
        return existo;
    }

    public void setExisto(Boolean existo) {
        this.existo = existo;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public int getOpCorrectas() {
        return opCorrectas;
    }

    public void setOpCorrectas(int opCorrectas) {
        this.opCorrectas = opCorrectas;
    }

    public int getOpIncorrectas() {
        return opIncorrectas;
    }

    public void setOpIncorrectas(int opIncorrectas) {
        this.opIncorrectas = opIncorrectas;
    }

    public int getOpTotales() {
        return opTotales;
    }

    public void setOpTotales(int opTotales) {
        this.opTotales = opTotales;
    }

    public int getPorcentAcierto() {
        return porcentAcierto;
    }

    public void setPorcentAcierto(int porcentAcierto) {
        this.porcentAcierto = porcentAcierto;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
