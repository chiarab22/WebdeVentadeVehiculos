package documentos;
public class TestComercial  
{  

   public void comercial(){
    // inicialización del comercial en el sistema  
    Comercial elComercial = Comercial.Instance();  
    elComercial.setNombre("Comercial Auto");  
    elComercial.setDireccion("Madrid");  
    elComercial.setEmail("comercial@comerciales.com");
    // muestra el comercial del sistema  
    visualiza();  
  }  
  
  public static void visualiza()
  {
    Comercial elComercial = Comercial.Instance();
    elComercial.visualiza();
  }
}