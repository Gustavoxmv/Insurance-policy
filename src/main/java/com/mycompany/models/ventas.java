/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;


public class ventas {
    
    
       
    private int id;
    private int poliza_id;
    private String promotor;
    private String cedula;
    private String fecharevision;
    private String tipo_pago;
    private String fecha_pago;
    private String referencia;
    private String mes;
    private String monto;
    
     public void setId(int id) {
        this.id = id;
    }

     public void setPoliza_id(int polizaid) {
        this.poliza_id = polizaid;
    }
     public void setPromotor(String promotor) {
        this.promotor=promotor;
     }
    
      public void setCedula(String cedula) {
        this.cedula=cedula;
     }
     
    public void setFecharevision(String fecharevision) {
        this.fecharevision = fecharevision;
    }
   
          public void setPago(String tipo_pago) {
        this.tipo_pago=tipo_pago;
     }
               public void setFecha_pago(String fecha_pago) {
                   this.fecha_pago=fecha_pago;
       
     }
          public void setReferencia(String referencia) {
        this.referencia=referencia;
     }
    
              public void setMes(String mes) {
        this.mes=mes;
     }
              
                public void setMonto(String monto) {
        this.monto=monto;
     }      
    
    public int getId() {
        return id;
    }
  public int getPoliza_Id() {
        return poliza_id;
    
  }

    public String getPromotor() {
        return promotor;
    }
    
    public String getCedula() {
        return cedula;
    }
    public String getFecharevision() {
        return fecharevision;
    }
    
    
     public String getTipo_pago() {
        return tipo_pago;
    }
    

    public String getFecha_pago() {
        return fecha_pago;
    }
    
    
     
     public String getReferencia() {
        return referencia;
    }
    
     public String getMes() {
        return mes;
    }
     public String getMonto() {
        return monto;
    }
   
    
}
