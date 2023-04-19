package Presentación;

import EntidadesCompartidas.Cliente;
import Logica.LogicaCliente;
import Logica.LogicaReservas;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AgregarCliente extends javax.swing.JPanel {

    public AgregarCliente() {
        initComponents();
    }

    LogicaCliente Logi = new LogicaCliente();
    Cliente mod = new Cliente();
    LogicaReservas resmod = new LogicaReservas();
     
     private void limpiarCajas(){
     
     T_CED.setText(null);
     T_NOM.setText(null);
     T_APE.setText(null);
     T_DIRE.setText(null);
     T_TEL.setText(null);
     T_MAIL.setText(null);
     T_CED.requestFocus();
     
     
 }
     
     private void limpiarcaja2(){
     T_NOM.setText(null);
     T_APE.setText(null);
     T_DIRE.setText(null);
     T_TEL.setText(null);
     T_MAIL.setText(null);
     T_CED.setText("");
     T_CED.requestFocus();
     T_CED.setEnabled(true);
     btnEliminar.setEnabled(false);
     btnModificar.setEnabled(false);
     btnGuardar.setEnabled(true);
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T_CED = new javax.swing.JTextField();
        T_APE = new javax.swing.JTextField();
        T_DIRE = new javax.swing.JTextField();
        T_TEL = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        T_MAIL = new javax.swing.JTextField();
        T_NOM = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setOpaque(false);

        T_CED.setBackground(new java.awt.Color(0, 0, 51));
        T_CED.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_CED.setForeground(new java.awt.Color(255, 255, 255));
        T_CED.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_CEDKeyTyped(evt);
            }
        });

        T_APE.setBackground(new java.awt.Color(0, 0, 51));
        T_APE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_APE.setForeground(new java.awt.Color(255, 255, 255));

        T_DIRE.setBackground(new java.awt.Color(0, 0, 51));
        T_DIRE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_DIRE.setForeground(new java.awt.Color(255, 255, 255));

        T_TEL.setBackground(new java.awt.Color(0, 0, 51));
        T_TEL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_TEL.setForeground(new java.awt.Color(255, 255, 255));
        T_TEL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_TELKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 0, 51));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrop.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro1.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mail:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cedula:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Registro de Cliente ");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        T_MAIL.setBackground(new java.awt.Color(0, 0, 51));
        T_MAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_MAIL.setForeground(new java.awt.Color(255, 255, 255));

        T_NOM.setBackground(new java.awt.Color(0, 0, 51));
        T_NOM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        T_NOM.setForeground(new java.awt.Color(255, 255, 255));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papelera1.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papeleara2.png"))); // NOI18N
        btnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papeleara2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar 1.png"))); // NOI18N
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setEnabled(false);
        btnModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar 2.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba1.png"))); // NOI18N
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba2.png"))); // NOI18N
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T_CED)
                            .addComponent(T_DIRE)
                            .addComponent(T_APE)
                            .addComponent(T_TEL)
                            .addComponent(T_MAIL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T_NOM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(2, 2, 2)
                        .addComponent(btnlimpiar)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(T_CED, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(T_APE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(T_DIRE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(T_TEL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(T_MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         if (T_CED.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "El campo de Cedula esta Vacio");
            limpiarCajas();
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(true);
            T_CED.requestFocus();
            return;
        }
        
        EntidadesCompartidas.Cliente ad = null;
        try{
            
        int Cedula = Integer.parseInt(T_CED.getText());
        ad = Logi.BuscarCliente(Cedula);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error a en la base de datos");
            limpiarCajas();
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(true);
            return;
        }
        if (ad != null) {
            
            mod = null;
            mod = Logi.BuscarCliente(Integer.parseInt(T_CED.getText()));
            T_NOM.setText(mod.getnombre());
            T_APE.setText(mod.getapellido());
            T_DIRE.setText(mod.getdireccio());
            T_TEL.setText(Integer.toString(mod.gettelefono()));
            T_MAIL.setText(mod.getmail());
            
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(false);
            T_CED.setEnabled(false);

        } else {     
            JOptionPane.showMessageDialog(null, "No existe Esta Cedula Desea agregarla!!");
            btnModificar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(true);
            T_CED.setEnabled(false);
            T_NOM.requestFocus();
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

          if(T_CED.getText().isEmpty()||T_NOM.getText().isEmpty()||T_APE.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Uno de los campos esta Vacio");
            return;
        }
        else if(T_DIRE.getText().isEmpty()||T_TEL.getText().isEmpty()||T_MAIL.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Uno de los campos esta Vacio");
            return;
        }
        else{
        mod.setcedula(Integer.parseInt(T_CED.getText()));
        mod.setnombre(T_NOM.getText());
        mod.setapellido(T_APE.getText());
        mod.setdireccion(T_DIRE.getText());
        mod.settelefono(Integer.parseInt(T_TEL.getText()));
        mod.setmail(T_MAIL.getText());
        Logi.AgregarCliente(mod);

        limpiarCajas();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  
        mod.setcedula(Integer.parseInt(T_CED.getText()));
        Logi.EliminarCliente(mod);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        T_CED.setEnabled(true);
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        mod.setnombre(T_NOM.getText());
        mod.setapellido(T_APE.getText());
        mod.setdireccion(T_DIRE.getText());
        mod.settelefono(Integer.parseInt(T_TEL.getText()));
        mod.setmail(T_MAIL.getText());
        mod.setcedula(Integer.parseInt(T_CED.getText()));
        
        Logi.ModificarCliente(mod);
        
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        
        limpiarcaja2();   
    }//GEN-LAST:event_btnModificarActionPerformed

    private void T_CEDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_CEDKeyTyped
       
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9'))evt.consume();
    }//GEN-LAST:event_T_CEDKeyTyped

    private void T_TELKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_TELKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9'))evt.consume();
    }//GEN-LAST:event_T_TELKeyTyped

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiarcaja2();
    }//GEN-LAST:event_btnlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T_APE;
    private javax.swing.JTextField T_CED;
    private javax.swing.JTextField T_DIRE;
    private javax.swing.JTextField T_MAIL;
    private javax.swing.JTextField T_NOM;
    private javax.swing.JTextField T_TEL;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
