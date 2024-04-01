
package builder;

public class MainBuilder {

    public static void main(String[] args) {
        ConstructorDocumentacionVehiculo constructor;
        constructor = new ConstructorDocumentacionVehiculoPDF();
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construir("JOHN");
        documentacion.imprimir();
    }
    
}
