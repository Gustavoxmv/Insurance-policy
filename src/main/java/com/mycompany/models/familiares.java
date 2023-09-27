/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;


public class familiares {
    
    private int id;
    private int poliza_id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String fecha_nacimiento;
    private String sexo;
    private String parentezco;
    
    
    
    
    public void setId(int id) {
        this.id = id;
    }

     public void setPoliza_id(int polizaid) {
        this.poliza_id = polizaid;
    }
     public void setNombre(String nombre) {
        this.nombre=nombre;
     }
    
      public void setApellido(String apellido) {
        this.apellido=apellido;
     }
     
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
   
          public void setSexo(String sexo) {
        this.sexo=sexo;
     }
          public void setParentezco(String parentezco) {
        this.parentezco=parentezco;
     }
    
              public void setCedula(String cedula) {
        this.cedula=cedula;
     }
    public int getId() {
        return id;
    }
  public int getPoliza_Id() {
        return poliza_id;
    
  }

   
    public String getNombre() {
        return nombre;
    }
    
    
     public String getApellido() {
        return apellido;
    }
    

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    
     
     public String getSexo() {
        return sexo;
    }
    
     public String getParentezco() {
        return parentezco;
    }
     public String getCedula() {
        return cedula;
    }
   
}
