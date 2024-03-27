
package abstractFactory;

public class ScooterElectrico extends Scooter {

    public ScooterElectrico(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Scooter ELÉCTRICO. Sus carácteristicas son: "
                + this.modelo + "\n" 
                + this.color + "\n"
                + this.potencia
        );
    }
    
    
}
