/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.ilib.DAOactasImpl;
import com.mycompany.ilib.DAOpolizasImpl;
import com.mycompany.ilib.Dashboard;
import static com.mycompany.ilib.Dashboard.ShowJPanel;
import com.mycompany.interfaces.DAOactas;
import com.mycompany.interfaces.DAOpolizas;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Antonio
 */
public class VerPolizas extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public VerPolizas() {
        initComponents();
        LoadUser();
     initStyles();
    }
   private void initStyles(){
   UserSearch.putClientProperty("JTextField.placeholderText", "Ingrese cédula a buscar");
   
   }
   
   private void LoadUser(){
   try{
    DAOpolizas dao= new DAOpolizasImpl();
    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
    dao.listar("").forEach((u)-> model.addRow(new Object[]{ u.getnumerocontrato(), u.getnombre(),u.getapellido(),u.getcedula(),u.getfecha_nacimiento(),u.gettelefono(),u.getdireccion(),u.getcorreo(),u.getprofesion(),u.getconevnio(),u.getplan(),u.getId()}));

    ocultarColumnas(jTable1, new int[] { 11});
   }
catch(Exception e)   
{
    System.out.println(e);
}
   }
   public void ocultarColumnas(JTable tbl, int columna[]) {
for (int i = 0; i < columna.length; i++) {
tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
}
}
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        UserSearch = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pólizas de Seguro"));

        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nºcontrato", "Nombre", "Apellido", "DNI/Cédula", "Fecha Nacimiento", "Teléfono", "Dirección", "Correo", "Profesión", "Convenio", "Plan", "ID"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(11).setMinWidth(50);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(11).setMaxWidth(50);
        }

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Buscar:");

        UserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSearchActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 51, 51));
        btnEditar.setText("Editar Cliente");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(51, 51, 51));
        btnBorrar.setText("Borrar Cliente");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Ver Grupo Familiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 51, 51));
        jToggleButton1.setText("Agregar Familiar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Agregar Ventas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Ver Ventas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnEditar)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    DAOpolizas dao= new DAOpolizasImpl();
   DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        for(int i: jTable1.getSelectedRows()){
   
   try{
     
   
    dao.eliminar((int) jTable1.getValueAt(i, 11));
   model.removeRow(i);
   }
catch(Exception e)   
{
    System.out.println(e);
}
   
   }
       
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void UserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
     String CedulaBuscar = UserSearch.getText();
    DAOpolizas dao= new DAOpolizasImpl();
    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    dao.listar(CedulaBuscar).forEach((u)-> model.addRow(new Object[]{ u.getnumerocontrato(), u.getnombre(),u.getapellido(),u.getcedula(),u.getfecha_nacimiento(),u.gettelefono(),u.getdireccion(),u.getcorreo(),u.getprofesion(),u.getconevnio(),u.getplan(),u.getId()}));

   }
catch(Exception e)   
{
    System.out.println(e);
}
   
   
                                          
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jTable1.getSelectedRow()>-1){
            try{
                int Polizasid=(int) jTable1.getValueAt(jTable1.getSelectedRow(),11);
                DAOpolizas dao= new DAOpolizasImpl();
                Dashboard.ShowJPanel(new VerGrupoFamiliar(dao.GetPolizasByID(Polizasid)));
            }
            catch(Exception e){
            }

        }

        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione el usuario","AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(jTable1.getSelectedRow()>-1){
            try{
                int Polizasid=(int) jTable1.getValueAt(jTable1.getSelectedRow(),11);
                DAOpolizas dao= new DAOpolizasImpl();
                Dashboard.ShowJPanel(new PolizasSeguro(dao.GetPolizasByID(Polizasid)));
            }
            catch(Exception e){
            }

        }

        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione el usuario","AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jTable1.getSelectedRow()>-1){
            try{
                int Polizasid=(int) jTable1.getValueAt(jTable1.getSelectedRow(),11);
                DAOpolizas dao= new DAOpolizasImpl();
                Dashboard.ShowJPanel(new GrupoFamiliar(dao.GetPolizasByID(Polizasid)));
            }
            catch(Exception e){
            }

        }

        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione el usuario","AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(jTable1.getSelectedRow()>-1){
            try{
                int Polizasid=(int) jTable1.getValueAt(jTable1.getSelectedRow(),11);
                DAOpolizas dao= new DAOpolizasImpl();
                Dashboard.ShowJPanel(new Ventas(dao.GetPolizasByID(Polizasid)));
            }
            catch(Exception e){
            }

        }
       else{
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione el usuario","AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   if(jTable1.getSelectedRow()>-1){
            try{
                int Polizasid=(int) jTable1.getValueAt(jTable1.getSelectedRow(),11);
                DAOpolizas dao= new DAOpolizasImpl();
                Dashboard.ShowJPanel(new Verventas(dao.GetPolizasByID(Polizasid)));
            }
            catch(Exception e){
            }

    }//GEN-LAST:event_jButton4ActionPerformed
    
    else{
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione el usuario","AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserSearch;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
