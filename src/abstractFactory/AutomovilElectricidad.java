
package abstractFactory;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Automóvil ELÉCTRICO. Sus carácteristicas son: "
                + this.modelo + "\n" 
                + this.color + "\n"
                + this.potencia + "\n"
                + this.espacio
        );
    }
    
    
}
