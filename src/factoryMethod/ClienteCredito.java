
package factoryMethod;

public class ClienteCredito extends Cliente {

    @Override
    protected Pedido crearPedido(double importe) {
        return new PedidoCredito(importe);
    }
    
}
