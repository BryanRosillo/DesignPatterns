
package abstractFactory;

public class AutomovilGasolina extends Automovil {

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Automóvil de GASOLINA. Sus carácteristicas son: "
                + this.modelo + "\n" 
                + this.color + "\n"
                + this.potencia + "\n"
                + this.espacio
        );
    }
   
    
}
