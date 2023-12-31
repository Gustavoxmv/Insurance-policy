package com.mycompany.views;

import com.mycompany.ilib.DAOactasImpl;
import static com.mycompany.ilib.Dashboard.ShowJPanel;

import com.mycompany.interfaces.DAOactas;
import com.mycompany.models.actas;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Returns extends javax.swing.JPanel {
boolean isEdition =false;
    actas actasEdition;
    public Returns() {
        initComponents();
        InitStyles();
    }
    
    public Returns(com.mycompany.models.actas Actas){
        initComponents();
        isEdition =true;
        actasEdition=Actas;
        InitStyles();
    }
    
    private void InitStyles() {
       
        cedulaTxt.putClientProperty("JTextField.placeholderText", "Ingrese cédula del difunto. ");
        fallecimientoTxt.putClientProperty("JTextField.placeholderText", "Ingrese fecha ");
        
        if(isEdition){
        button1.setText("Actualizar");
        
        if(actasEdition != null){
       
            nombreTxt.setText(actasEdition.getNombre());
         cedulaTxt.setText(String.valueOf(actasEdition.getCedula()));
         fallecimientoTxt.setText(actasEdition.getFecha_fallecimiento());
         txtruta.setText(actasEdition.getFoto());
         
       
        }
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        folioLbl = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        fallecimientoTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        txtruta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("Nombre del difunto");

        folioLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        folioLbl.setForeground(new java.awt.Color(51, 51, 51));
        folioLbl.setText("DNI/Cédula de identidad del difunto");

        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });

        libroIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        libroIdLbl.setForeground(new java.awt.Color(51, 51, 51));
        libroIdLbl.setText("Fecha Fallecimiento");

        fallecimientoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallecimientoTxtActionPerformed(evt);
            }
        });

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Ver Actas");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Foto de Acta de Defunciòn");

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Subir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(18, 90, 173));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Ingresar");
        button1.setBorderPainted(false);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        txtruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutaActionPerformed(evt);
            }
        });

        lblFoto.setForeground(new java.awt.Color(51, 51, 51));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("Imagen");
        lblFoto.setToolTipText("");

        nombreTxt.setCaretColor(new java.awt.Color(102, 102, 102));
        nombreTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombreTxt.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        nombreTxt.setSelectedTextColor(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(199, 199, 199))
                                    .addComponent(cedulaTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(223, 223, 223))
                                    .addComponent(fallecimientoTxt)
                                    .addComponent(nombreTxt))
                                .addGap(92, 92, 92))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(259, 259, 259)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fallecimientoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addContainerGap(387, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
ShowJPanel(new VerActa());    

        

              
    }//GEN-LAST:event_buttonActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
     
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void fallecimientoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallecimientoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fallecimientoTxtActionPerformed
private byte[] getImagen(String Ruta) {
        File imagen = new File(Ruta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (Exception ex) {
            return null;
        }
    }
    
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
String nombre=nombreTxt.getText();
int i = Integer.parseInt(cedulaTxt.getText());
String fecha_fallecimiento=fallecimientoTxt.getText();
String rutaImagen=txtruta.getText();
        
              if(nombre.isEmpty()){
 javax.swing.JOptionPane.showMessageDialog(this, "Debe colocar al menos un nombre. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
         
            return;}
              
com.mycompany.models.actas Actas=isEdition ? actasEdition : new com.mycompany.models.actas();

Actas.setNombre(nombre);
Actas.setCedula(i);
Actas.setFecha_fallecimiento(fecha_fallecimiento);
Actas.setFoto(rutaImagen);

   try{
   DAOactas dao= new DAOactasImpl();
   if(!isEdition)
       dao.registrar(Actas);
       
   else 
       dao.modificar(Actas);
        
   String succesMessage = isEdition ? "Modificado" : "Registrado";
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario "+succesMessage+ " exitosamente. \n", "AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        if(!isEdition){ nombreTxt.setText("");
            cedulaTxt.setText("");
               fallecimientoTxt.setText("");
               txtruta.setText("");}
   }   catch (Exception e){
 String errorMessage = isEdition ? "Modificar" : "Registrar";
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un error al "+errorMessage+ " el usuario. \n", "AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }  
      

       
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
     JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        
        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtruta.setText(ruta);
            
            Image foto = getToolkit().getImage(txtruta.getText());
            foto.getScaledInstance(1,1,1);
            lblFoto.setIcon(new ImageIcon(foto));
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JButton button1;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JTextField fallecimientoTxt;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables
}
