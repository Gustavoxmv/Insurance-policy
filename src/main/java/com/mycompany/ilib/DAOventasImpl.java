package com.mycompany.ilib;
import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOventas;
import com.mycompany.models.ventas;
import com.mycompany.models.ventas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.models.familiares;
import java.io.FileInputStream;

public class DAOventasImpl extends Database implements DAOventas{

    @Override
    public void registrar(ventas ventas) throws Exception {
         try{
        this.Conectar();
        String command = "INSERT INTO ventas (poliza_id,promotor,cedula,Fecharevision,tipo_pago,fecha_pago,referencia,mes,monto) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, ventas.getPoliza_Id());   
        st.setString(2, ventas.getPromotor());      
        st.setString(3, ventas.getCedula());
        st.setString(4, ventas.getFecharevision());   
        st.setString(5, ventas.getTipo_pago());
        st.setString(6,ventas.getFecha_pago());
        st.setString(7,ventas.getReferencia());
                st.setString(8,ventas.getMes());
                        st.setString(9,ventas.getMonto()
        );
        
        
        
        
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
    public void modificar(ventas Ventas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int ventasid) throws Exception {
       try{
        this.Conectar();
        String command = ("Delete from ventas where id= ?;");
        PreparedStatement st = this.conexion.prepareStatement(command);


        st.setInt(1, ventasid);
        
        st.executeUpdate();
        st.close();
        st.close();
      } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
    }


    public List<ventas> listar(int polizaid) throws Exception {
 List<ventas> lista= null;
        try{
       this.Conectar();
         String Query = "SELECT * FROM ventas WHERE poliza_id Like '%"+polizaid+"%' ;";
        PreparedStatement st = this.conexion.prepareStatement(Query);
        
        lista= new ArrayList();
        ResultSet rs= st.executeQuery();
        while(rs.next()){
        ventas Ventas = new ventas();
        Ventas.setId(rs.getInt("id"));
        Ventas.setPoliza_id(rs.getInt("poliza_id"));
        Ventas.setPromotor(rs.getString("promotor"));
        Ventas.setCedula(rs.getString("cedula"));
       Ventas.setFecharevision(rs.getString("fecharevision"));
       Ventas.setPago(rs.getString("tipo_pago"));
      Ventas.setFecha_pago(rs.getString("fecha_pago"));
       Ventas.setReferencia(rs.getString("referencia"));
      Ventas.setMes(rs.getString("mes"));
      Ventas.setMonto(rs.getString("monto"));
          
      lista.add(Ventas);
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
    
  
  
    public ventas GetventasByID(int ventasid) throws Exception {
     ventas Ventas= new ventas();
     
        try{
       this.Conectar();
        
        PreparedStatement st = this.conexion.prepareStatement("Select * From ventas Where id = ? Limit 1;");
        st.setInt(1, ventasid);
       
        ResultSet rs= st.executeQuery();
        while(rs.next()){
    
        Ventas.setId(rs.getInt("id"));
        
     
        }
        rs.close();
        rs.close();
       }
       catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
      }
      return Ventas;
    }

    
 
    public ventas GetFamiliaresByID(int polizasid) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
}