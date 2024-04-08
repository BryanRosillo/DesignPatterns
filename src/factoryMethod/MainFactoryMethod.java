
package factoryMethod;

public class MainFactoryMethod {

    public static void main(String[] args) {
        Cliente cliente = new ClienteContado();
        cliente.nuevoPedido(3000);
        cliente.nuevoPedido(20000);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(3500);
        cliente.nuevoPedido(25000);
    }
    
}
