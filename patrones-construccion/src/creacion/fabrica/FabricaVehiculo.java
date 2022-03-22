package creacion.fabrica;

import creacion.automovil.Automovil;
import creacion.scooter.Scooter;

public interface FabricaVehiculo  
{  
  Automovil creaAutomovil(String modelo, String color,  
    int potencia, double espacio);  
  
  Scooter creaScooter(String modelo, String color, int  
    potencia);  
}  