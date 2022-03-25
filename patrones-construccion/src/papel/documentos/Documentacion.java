package papel.documentos;

import java.util.*;  
  
public abstract class Documentacion  
{  
    protected List<String> contenido =  
        new ArrayList<String>();  
  
    public abstract void agregaDocumento(String documento);  
    public abstract void imprime();  
}  
  
public class DocumentacionHtml extends Documentacion  
{  
    public void agregaDocumento(String documento)  
    {  
        if (documento.startsWith("<HTML>"))  
            contenido.add(documento);  
    }  
  
    public void imprime()  
    {  
        System.out.println("Documentacion HTML");  
        for (String s: contenido)  
            System.out.println(s);  
    }  
}


