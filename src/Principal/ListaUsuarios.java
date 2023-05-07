package Principal;

public class ListaUsuarios {

    public static int posUsuario = -2;

    public static Usuario[] matrizUsuarios = new Usuario[4];

    public ListaUsuarios() {
        if (posUsuario == -2) {
            for (int i = 0; i < 4; i++) {
                matrizUsuarios[i] = new Usuario();
            }
            //BORRAR
            posUsuario = 0;
            Usuario user = new Usuario("La", "Vida", 8, "Masculino", "3ro");
            ListaUsuarios.matrizUsuarios[ListaUsuarios.posUsuario] = user;
            posUsuario = -1;
            //BORRAR

        }
    }
}
