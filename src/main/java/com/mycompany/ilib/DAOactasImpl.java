
package com.mycompany.ilib;
import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOactas;
import com.mycompany.models.actas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.models.actas;
import java.io.FileInputStream;
/**
 *
 * @author Gustavo
 */
public class DAOactasImpl extends Database implements DAOactas{

    @Override
    public void registrar(actas actas) throws Exception {
      try{
        this.Conectar();
        String command = "INSERT INTO actas (nombre,cedula,fecha_fallecimiento,foto) VALUES (?,?,?,?)";
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setString(1, actas.getNombre());
        st.setInt(2, actas.getCedula());
        st.setString(3, actas.getFecha_fallecimiento());
        st.setString(4,actas.getFoto());
        
        
        
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
    public void modificar(actas actas) throws Exception {
        try{
        this.Conectar();
        String command = ("UPDATE actas SET nombre = ?,cedula = ?,fecha_fallecimiento = ?,foto=? where id=?");
        PreparedStatement st = this.conexion.prepareStatement(command);
           
         st.setString(1, actas.getNombre());
        st.setInt(2, actas.getCedula());
        st.setString(3, actas.getFecha_fallecimiento());
        st.setString(4,actas.getFoto());
           st.setInt(5, actas.getId());
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
    public void eliminar(int actasid) throws Exception {
        try{
        this.Conectar();
        String command = ("Delete from actas where id= ?;");
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, actasid);
        
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
    public List<actas> listar(String nombre) throws Exception {
      List<actas> lista= null;
        try{
       this.Conectar();
         String Query = nombre.isEmpty() ? "SELECT * FROM actas;" : "SELECT * FROM  actas WHERE cedula Like '%"+nombre+"%' ;";
        PreparedStatement st = this.conexion.prepareStatement(Query);
        
        lista= new ArrayList();
        ResultSet rs= st.executeQuery();
        while(rs.next()){
        actas Actas = new actas();
        Actas.setId(rs.getInt("id"));
        Actas.setNombre(rs.getNString("nombre"));
        Actas.setCedula(rs.getInt("cedula"));
        Actas.setFecha_fallecimiento(rs.getNString("fecha_fallecimiento"));
        Actas.setFoto(rs.getNString("foto"));
        lista.add(Actas);
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
    public actas GetActasByID(int actasid) throws Exception {
     actas Actas= new actas();
     
        try{
       this.Conectar();
        
        PreparedStatement st = this.conexion.prepareStatement("Select * From actas Where id = ? Limit 1;");
        st.setInt(1, actasid);
       
        ResultSet rs= st.executeQuery();
        while(rs.next()){
    
        Actas.setId(rs.getInt("id"));
        Actas.setNombre(rs.getNString("nombre"));
        Actas.setCedula(rs.getInt("cedula"));
        Actas.setFecha_fallecimiento(rs.getNString("fecha_fallecimiento"));
        Actas.setFoto(rs.getNString("foto"));
     
        }
        rs.close();
        rs.close();
       }
       catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      return Actas;
    }
    }
 

    

