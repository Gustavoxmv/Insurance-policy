package com.mycompany.models;

public class actas {
    private int id;
    private String nombre;
    private int cedula;
    private String fecha_fallecimiento;
    private String foto;
    
    public void setId(int id) {
        this.id = id;
    }

     public void setNombre(String nombre) {
        this.nombre=nombre;

     }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setFecha_fallecimiento(String fecha_fallecimiento) {
        this.fecha_fallecimiento = fecha_fallecimiento;
    }
      public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }
  public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getFecha_fallecimiento() {
        return fecha_fallecimiento;
    }
    
    public String getFoto() {
        return foto;
    }

   
  
    
}
    
   