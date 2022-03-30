import pedidos.Usuario;
import creacion.Catalogo;
import documentos.TestComercial;

public class App {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.catalogos();
        System.out.println();
        Usuario usuario = new Usuario();
        usuario.crearUsuario();
        System.out.println();
        TestComercial testComercial = new TestComercial();
        testComercial.comercial();

    }
}
