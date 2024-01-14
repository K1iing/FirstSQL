import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        

        Usuario u = new Usuario();
        u.setNome("Hayke333");
        u.setEmail("abesta@gmail.com");
        u.setSenha("chupacu123");
        u.setLogin("chupacumatador");

        new UsuarioDAO().cadastrarUsuario(u);

    }
}
