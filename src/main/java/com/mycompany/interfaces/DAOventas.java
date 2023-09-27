package com.mycompany.interfaces;
import com.mycompany.models.ventas;
import java.util.List;


public interface DAOventas {
     public void registrar(ventas Ventas) throws Exception;
    public void modificar(ventas Ventas) throws Exception;    
    public void eliminar(int Ventas) throws Exception;
    public List<ventas> listar(int polizaid) throws Exception;
    
     public ventas GetventasByID(int polizasid) throws Exception;
//        public familiares GetActasByID(int actasid) throws Exception;
}
