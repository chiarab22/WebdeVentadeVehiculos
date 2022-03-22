import pedidos.Usuario;
import creacion.Catalogo;
import documentos.TestComercial;

public class App {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.catalogos();
        Usuario usuario = new Usuario();
        usuario.crearUsuario();
        TestComercial testComercial = new TestComercial();
        testComercial.comercial();

    }
}
