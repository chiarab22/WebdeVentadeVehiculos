package pedidos.clientes;

import pedidos.pedidosClases.Pedido;
import pedidos.pedidosClases.PedidoContado;

public class ClienteContado extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}