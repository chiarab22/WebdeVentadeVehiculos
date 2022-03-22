package creacion.fabrica;

import creacion.automovil.Automovil;
import creacion.automovil.AutomovilElectricidad;
import creacion.scooter.Scooter;
import creacion.scooter.ScooterElectricidad;

public class FabricaVehiculoElectricidad implements FabricaVehiculo  
{  
  public Automovil creaAutomovil(String modelo, String  
    color, int potencia, double espacio)  
  {  
    return new AutomovilElectricidad(modelo, color,  
      potencia, espacio);  
  }  
  
  public Scooter creaScooter(String modelo, String  
    color, int potencia)  
  {  
    return new ScooterElectricidad(modelo, color,  
      potencia);  
  }  
}  
