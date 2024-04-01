
package builder;

public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;
    
    public Vendedor(ConstructorDocumentacionVehiculo constructor){
        this.constructor = constructor;
    }
    
    public Documentacion construir(String nombreCliente){
        constructor.construirSolicitudPedido(nombreCliente);
        constructor.construirSolicitudMatriculacion(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
            
    
    
}
