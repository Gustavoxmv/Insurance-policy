package com.mycompany.interfaces;
import com.mycompany.models.familiares;
import java.util.List;


public interface DAOfamiliares {
     public void registrar(familiares Familiares) throws Exception;
    public void modificar(familiares Familiares) throws Exception;    
    public void eliminar(int Familiares) throws Exception;
    public List<familiares> listar(int polizaid) throws Exception;
    
     public familiares GetFamiliaresByID(int polizasid) throws Exception;
//        public familiares GetActasByID(int actasid) throws Exception;
}
