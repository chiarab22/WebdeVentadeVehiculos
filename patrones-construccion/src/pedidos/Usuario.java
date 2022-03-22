package pedidos;

import pedidos.clientes.Cliente;
import pedidos.clientes.ClienteContado;
import pedidos.clientes.ClienteCredito;

public class Usuario {

    public void crearUsuario() {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}