package creacion.fabrica;

import creacion.automovil.Automovil;
import creacion.automovil.AutomovilGasolina;
import creacion.scooter.Scooter;
import creacion.scooter.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo  
{  
  public Automovil creaAutomovil(String modelo, String  
    color, int potencia, double espacio)  
  {  
    return new AutomovilGasolina(modelo, color,  
      potencia, espacio);  
  }  
  
  public Scooter creaScooter(String modelo, String  
    color, int potencia)  
  {  
    return new ScooterGasolina(modelo, color, potencia);  
  }  
}