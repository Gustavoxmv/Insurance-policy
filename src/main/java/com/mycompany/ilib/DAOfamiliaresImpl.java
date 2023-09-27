package com.mycompany.ilib;
import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOfamiliares;
import com.mycompany.models.familiares;
import com.mycompany.models.familiares;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.models.familiares;
import java.io.FileInputStream;

public class DAOfamiliaresImpl extends Database implements DAOfamiliares{

    @Override
    public void registrar(familiares familiares) throws Exception {
         try{
        this.Conectar();
        String command = "INSERT INTO familiares (poliza_id,nombre,apellido,cedula,fecha_nacimiento,sexo,parentezco) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, familiares.getPoliza_Id());   
        st.setString(2, familiares.getNombre());      
        st.setString(3, familiares.getApellido());
        st.setString(4, familiares.getCedula());   
        st.setString(5, familiares.getFecha_nacimiento());
        st.setString(6,familiares.getSexo());
        st.setString(7,familiares.getParentezco());
        
        
        
        
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
    public void modificar(familiares Familiares) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int familiaresid) throws Exception {
       try{
        this.Conectar();
        String command = ("Delete from familiares where id= ?;");
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, familiaresid);
        
        st.executeUpdate();
        st.close();
        st.close();
      } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
    }


    public List<familiares> listar(int polizaid) throws Exception {
 List<familiares> lista= null;
        try{
       this.Conectar();
         String Query = "SELECT * FROM familiares WHERE poliza_id Like '%"+polizaid+"%' ;";
        PreparedStatement st = this.conexion.prepareStatement(Query);
        
        lista= new ArrayList();
        ResultSet rs= st.executeQuery();
        while(rs.next()){
        familiares Familiares = new familiares();
        Familiares.setId(rs.getInt("id"));
         Familiares.setPoliza_id(rs.getInt("poliza_id"));
        Familiares.setNombre(rs.getString("nombre"));
       Familiares.setApellido(rs.getString("apellido"));
       Familiares.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
       Familiares.setSexo(rs.getString("sexo"));
       Familiares.setParentezco(rs.getString("parentezco"));
       Familiares.setCedula(rs.getString("cedula"));
          
      lista.add(Familiares);
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
    
  
    public familiares GetfamiliaresByID(int familiaresid) throws Exception {
     familiares Familiares= new familiares();
     
        try{
       this.Conectar();
        
        PreparedStatement st = this.conexion.prepareStatement("Select * From familiares Where id = ? Limit 1;");
        st.setInt(1, familiaresid);
       
        ResultSet rs= st.executeQuery();
        while(rs.next()){
    
        Familiares.setId(rs.getInt("id"));
        
     
        }
        rs.close();
        rs.close();
       }
       catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      return Familiares;
    }

 
    public familiares GetFamiliaresByID(int polizasid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}
