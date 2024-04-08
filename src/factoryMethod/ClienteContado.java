
package factoryMethod;

public class ClienteContado extends Cliente {

    @Override
    protected Pedido crearPedido(double importe) {
        return new PedidoContado(importe);
    }
    
}
