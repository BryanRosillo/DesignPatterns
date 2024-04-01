
package builder;

public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHTML() {
        documentacion = new DocumentacionHTML();
    }
    
    @Override
    public void construirSolicitudPedido(String nombreCliente) {
        String documento = "<HTML>Solicitud de pedido cliente: " + nombreCliente + "<HTML>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construirSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<HTML>Solicitud de matriculacion solicitante: " + nombreSolicitante + "<HTML>";
        documentacion.agregarDocumento(documento);
    }
    
}
