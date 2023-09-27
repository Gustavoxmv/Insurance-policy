/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ilib;
import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOpolizas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.models.polizas;
/**
 *
 * @author Gustavo
 */
public class DAOpolizasImpl extends Database implements DAOpolizas{

    @Override
    public void registrar(polizas Polizas) throws Exception {
        try{
        this.Conectar();
        String command = "INSERT INTO polizas (numerocontrato,nombre,apellido,cedula,fecha_nacimiento,telefono,direccion,correo,profesion,convenio,plan) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setString(1, Polizas.getnumerocontrato());
          st.setString(2, Polizas.getnombre());
            st.setString(3, Polizas.getapellido());
              st.setString(4, Polizas.getcedula());
                st.setString(5, Polizas.getfecha_nacimiento());
                  st.setString(6, Polizas.gettelefono());
                    st.setString(7, Polizas.getdireccion()); 
                    st.setString(8, Polizas.getcorreo());
                                    st.setString(9, Polizas.getprofesion());
                                                    st.setString(10, Polizas.getconevnio());
                                                    st.setString(11, Polizas.getplan());
                    
       
        
          st.executeUpdate();
        

        st.close();
        st.close();
      } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
    }

    @Override
    public void modificar(polizas polizas) throws Exception {
   try{
        this.Conectar();
        String command = ("UPDATE polizas SET numerocontrato = ?,nombre = ?,apellido =?,cedula=?,fecha_nacimiento =?,telefono =?,direccion =?,correo =?,profesion =?,convenio=?,plan=? where id=?");
        
        PreparedStatement st = this.conexion.prepareStatement(command);
           
         st.setString(1, polizas.getnumerocontrato());
          st.setString(2, polizas.getnombre());
            st.setString(3, polizas.getapellido());
              st.setString(4, polizas.getcedula());
                st.setString(5, polizas.getfecha_nacimiento());
                  st.setString(6, polizas.gettelefono());
                    st.setString(7, polizas.getdireccion()); 
                    st.setString(8, polizas.getcorreo());
                        st.setString(9, polizas.getprofesion());
                          st.setString(10, polizas.getconevnio());
                              st.setString(11, polizas.getplan());
                              st.setInt(12, polizas.getId());
            st.executeUpdate();
            st.close();
        
        }
        
   catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      
    }

    

    @Override
    public void eliminar(int polizasid) throws Exception {
         try{
        this.Conectar();
        String command = ("Delete from polizas where id= ?;");
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, polizasid);
        
        st.executeUpdate();
        st.close();
        st.close();
      } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
    }

    @Override
    public List<polizas> listar(String cedula) throws Exception {
         List<polizas> lista= null;
        try{
       this.Conectar();
         String Query = cedula.isEmpty() ? "SELECT * FROM polizas;" : "SELECT * FROM polizas WHERE cedula Like '%"+cedula+"%' ;";
        PreparedStatement st = this.conexion.prepareStatement(Query);
        
        lista= new ArrayList();
        ResultSet rs= st.executeQuery();
        while(rs.next()){
        polizas Polizas = new polizas();
        Polizas.setId(rs.getInt("id"));
        Polizas.setnumerocontrato(rs.getNString("numerocontrato"));
        Polizas.setnombre(rs.getNString("nombre"));
       Polizas.setapellido(rs.getNString("apellido"));
       Polizas.setcedula(rs.getNString("cedula"));
       Polizas.setfecha_nacimiento(rs.getNString("fecha_nacimiento"));
       Polizas.settelefono(rs.getNString("telefono"));
       Polizas.setdireccion(rs.getNString("direccion"));
           Polizas.setcorreo(rs.getNString("correo"));
       Polizas.setprofesion(rs.getNString("profesion"));
       Polizas.setconvenio(rs.getNString("convenio"));
       Polizas.setplan(rs.getNString("plan"));
      lista.add(Polizas);
        }
        rs.close();
        rs.close();
       }
       catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      return lista;
    }

    @Override
    public polizas GetPolizasByID(int polizasid) throws Exception {
polizas Polizas= new polizas();
     
        try{
       this.Conectar();
        
        PreparedStatement st = this.conexion.prepareStatement("Select * From polizas Where id = ? Limit 1;");
        st.setInt(1, polizasid);
       
        ResultSet rs= st.executeQuery();
        while(rs.next()){
    
        
        Polizas.setId(rs.getInt("id"));
        Polizas.setnumerocontrato(rs.getNString("numerocontrato"));
        Polizas.setnombre(rs.getNString("nombre"));
       Polizas.setapellido(rs.getNString("apellido"));
       Polizas.setcedula(rs.getNString("cedula"));
       Polizas.setfecha_nacimiento(rs.getNString("fecha_nacimiento"));
       Polizas.settelefono(rs.getNString("telefono"));
       Polizas.setdireccion(rs.getNString("direccion"));
           Polizas.setcorreo(rs.getNString("correo"));
       Polizas.setprofesion(rs.getNString("profesion"));
       Polizas.setconvenio(rs.getNString("convenio"));
       Polizas.setplan(rs.getNString("plan"));
     
        }
        rs.close();
        rs.close();
       }
       catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      return Polizas;
    }
    }
    
    
   
   

