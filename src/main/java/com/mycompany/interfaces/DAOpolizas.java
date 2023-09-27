/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.polizas;
import java.util.List;

public interface DAOpolizas {
    
public void registrar(polizas Polizas) throws Exception;
    public void modificar(polizas Polizas) throws Exception;    
    public void eliminar(int Polizas) throws Exception;
    public List<polizas> listar(String cedula) throws Exception;
        public polizas GetPolizasByID(int polizasid) throws Exception;

}
