
package abstractFactory;

public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(
                "Scooter DE GASOLINA. Sus carácteristicas son: "
                + this.modelo + "\n" 
                + this.color + "\n"
                + this.potencia
        );
    }
    
    
}
