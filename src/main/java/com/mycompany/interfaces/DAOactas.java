package com.mycompany.interfaces;

import com.mycompany.models.actas;
import java.util.List;

public interface DAOactas {
    public void registrar(actas Actas) throws Exception;
    public void modificar(actas Actas) throws Exception;    
    public void eliminar(int Actas) throws Exception;
    public List<actas> listar(String cedula) throws Exception;
        public actas GetActasByID(int actasid) throws Exception;

}