
package builder;

public class DocumentacionPDF extends Documentacion {

    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<PDF>")){
            contenido.add(documento);
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion PDF\n");
        for(String documento: contenido){
            System.out.println(documento);
        }
    }
    
}
