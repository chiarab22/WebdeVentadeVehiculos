package papel.documentacion;

import java.util.*;

import documentos.Documento;  
public class DocumentacionCliente extends Documentacion  
{  
    public DocumentacionCliente(String informacion)  
    {  
        ArrayList<Documento> documentos = new ArrayList<Documento>();  
        DocumentacionEnBlanco documentacionEnBlanco =  
            DocumentacionEnBlanco.Instance();  
        List<Documento> documentosEnBlanco =  
          documentacionEnBlanco.getDocumentos();  
        for (Documento documento: documentosEnBlanco)  
        {  
            Documento copiaDocumento = documento.duplica();  
            copiaDocumento.rellena(informacion);  
            documentos.add(copiaDocumento);  
        }  
    }  
  
    public void visualiza()  
    {  
        for (Documento documento: documento)  
            documento.visualiza();  
    }  
  
    public void imprime()  
    {  
        for (Documento documento: documento)  
            documento.imprime();  
    }

    @Override
    public void agregaDocumento(String documento) {
        // TODO Auto-generated method stub
        
    }  
}