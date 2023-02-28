
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoSerranoSanchezJesusAngel2223 miVehiculoSerranoSanchezJesusAngel2223;
        int stockActual;
          System.out.println("Jesus");
        operativaVehiculosSerranoSanchezJesusAngel2223(50);
    }

    private static void operativaVehiculosSerranoSanchezJesusAngel2223(java.lang.Integer cantidad) {
        VehiculoSerranoSanchezJesusAngel2223 miVehiculoSerranoSanchezJesusAngel2223;
        int stockActual;
        miVehiculoSerranoSanchezJesusAngel2223 = new VehiculoSerranoSanchezJesusAngel2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoSerranoSanchezJesusAngel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoSerranoSanchezJesusAngel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoSerranoSanchezJesusAngel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
