package pedidos.clientes;

import pedidos.pedidosClases.Pedido;
import pedidos.pedidosClases.PedidoCredito;

public class ClienteCredito extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}