
package builder;

public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPDF() {
        documentacion = new DocumentacionPDF();
    }

    @Override
    public void construirSolicitudPedido(String nombreCliente) {
        String documento = "<PDF>Solicitud de pedido cliente: " + nombreCliente + "<PDF>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construirSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<PDF>Solicitud de matriculacion solicitante: " + nombreSolicitante + "<PDF>";
        documentacion.agregarDocumento(documento);
    }
    
}
