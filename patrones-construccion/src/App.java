import pedidos.Usuario;
import creacion.Catalogo;
import documentos.TestComercial;
import papel.ClienteVehiculo;
import papel.Usuario2;

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
        ClienteVehiculo clienteVehiculo = new ClienteVehiculo();
        clienteVehiculo.mostrar();
        Usuario2 usuario2 = new Usuario2();
        usuario2.mostrar();

    }
}
