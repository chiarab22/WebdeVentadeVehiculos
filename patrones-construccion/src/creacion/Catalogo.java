package creacion;

import java.util.*;

import creacion.automovil.Automovil;
import creacion.fabrica.FabricaVehiculo;
import creacion.fabrica.FabricaVehiculoElectricidad;
import creacion.fabrica.FabricaVehiculoGasolina;
import creacion.scooter.Scooter; 


public class Catalogo  
{   
  
  public static int nAutos = 3;  
  public static int nScooters = 2;  

  public void catalogos(){
    try (Scanner reader = new Scanner(System.in)) {
        FabricaVehiculo fabrica;  
        Automovil[] autos = new Automovil[nAutos];  
        Scooter[] scooters = new Scooter[nScooters];  
        System.out.print("Desea utilizar " +  
          "vehiculos electricos (1) o a gasolina (2):");  
        String eleccion = reader.next();  
        if (eleccion.equals("1"))  
        {  
          fabrica = new FabricaVehiculoElectricidad();  
        }  
        else  
        {  
          fabrica = new FabricaVehiculoGasolina();  
        }  
        for (int index = 0; index < nAutos; index++)  
          autos[index] = fabrica.creaAutomovil("estandar",   
            "amarillo", 6+index, 3.2);  
        for (int index = 0; index < nScooters; index++)  
          scooters[index] = fabrica.creaScooter("clasico",   
            "rojo", 2+index);  
        for (Automovil auto: autos)  
          auto.mostrarCaracteristicas();  
        for (Scooter scooter: scooters)  
          scooter.mostrarCaracteristicas();
    }  
  }
  
}