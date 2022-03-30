package papel.documentacion;

import java.util.*;  
public class DocumentacionEnBlanco extends Documentacion  
{  
    private static DocumentacionEnBlanco _instance = null;  
  
    private DocumentacionEnBlanco()  
    {  
        documentos = new ArrayList<Documento>();  
    }  
  
    public static DocumentacionEnBlanco Instance()  
    {  
        if (_instance == null)  
            _instance = new DocumentacionEnBlanco();  
        return _instance;  
    }  
  
    public void incluye(Documento doc)  
    {  
        documentos.add(doc);  
    }  
  
    public void excluye(Documento doc)  
    {  
        documentos.remove(doc);  
    }

    @Override
    public void agregaDocumento(String documento) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        
    }  
}