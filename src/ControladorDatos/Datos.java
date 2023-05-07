package ControladorDatos;

import Principal.ListaUsuarios;
import Principal.Usuario;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

    public static String nombreFichero = "src/Registros/perfiles.txt";

    public static void guardarPerfiles() {
        String linea;
        Usuario objUsuario;
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < ListaUsuarios.matrizUsuarios.length; i++) {
                objUsuario = ListaUsuarios.matrizUsuarios[i];
                linea = objUsuario.existo + "-";
                if (objUsuario.existo) {
                    linea += objUsuario.getNombre() + "-";
                    linea += objUsuario.getApellido() + "-";
                    linea += objUsuario.getEdad() + "-";
                    linea += objUsuario.getSexo() + "-";
                    linea += objUsuario.getGrado() + "-";
                    linea += objUsuario.iniciales + "-";
                    linea += objUsuario.getBits() + "-";
                    linea += objUsuario.getOpCorrectas() + "-";
                    linea += objUsuario.getOpIncorrectas() + "-";
                    linea += objUsuario.getOpTotales() + "-";
                    linea += objUsuario.getPorcentAcierto() + "-";
                    linea += objUsuario.getNivel() + "-";
                }
                pw.println(linea);
            }
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cargarPerfiles() {
        String[] ArrEst;

        try {
            FileReader fr;
            String linea;
            File file = new File(nombreFichero);
            if (file.exists()) {
                fr = new FileReader(nombreFichero);
                BufferedReader br = new BufferedReader(fr);

                int i = 0;
                while ((linea = br.readLine()) != null) {
                    Usuario objUsuario = new Usuario();
                    ArrEst = linea.split("-");

                    objUsuario.setExisto(Boolean.parseBoolean(ArrEst[0]));
                    if (Boolean.parseBoolean(ArrEst[0])) {
                        objUsuario.setNombre(ArrEst[1]);
                        objUsuario.setApellido(ArrEst[2]);
                        objUsuario.setEdad(Integer.parseInt(ArrEst[3]));
                        objUsuario.setSexo(ArrEst[4]);
                        objUsuario.setGrado(ArrEst[5]);
                        objUsuario.iniciales = ArrEst[6];
                        objUsuario.setBits(Integer.parseInt(ArrEst[7]));
                        objUsuario.setOpCorrectas(Integer.parseInt(ArrEst[8]));
                        objUsuario.setOpIncorrectas(Integer.parseInt(ArrEst[9]));
                        objUsuario.setOpTotales(Integer.parseInt(ArrEst[10]));
                        objUsuario.setPorcentAcierto(Integer.parseInt(ArrEst[11]));
                        objUsuario.setNivel(Integer.parseInt(ArrEst[12]));
                    }
                    ListaUsuarios.matrizUsuarios[i] = objUsuario;
                    i++;
                }
                br.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
