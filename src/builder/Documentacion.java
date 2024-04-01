
package builder;

import java.util.*;

public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<String>();
    
    public abstract void agregarDocumento(String documento);
    public abstract void imprimir();
}
