
package builder;

public class DocumentacionHTML extends Documentacion {

    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<HTML>")){
            contenido.add(documento);
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion HTML\n");
        for(String documento: contenido){
            System.out.println(documento);
        }
    }
    
}
