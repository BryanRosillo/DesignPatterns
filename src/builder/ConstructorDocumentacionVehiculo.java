
package builder;

public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;
    
    public abstract void construirSolicitudPedido(String nombreCliente);
   
    public abstract void construirSolicitudMatriculacion(String nombreSolicitante);
    
    public Documentacion resultado(){
        return documentacion;
    }
   
}
