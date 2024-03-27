
package abstractFactory;

public class MainAbstractFactory {

    public static void main(String[] args) {
       FabricaVehiculo fabrica;
       
       fabrica = new FabricaVehiculoElectricidad();
       fabrica.crearAutomovil("A", "Amarillo", 2, 4).mostrarCaracteristicas();
       
       fabrica = new FabricaVehiculoGasolina();
       fabrica.crearScooter("B", "Naranja", 4).mostrarCaracteristicas();
       
       
    }
    
}
