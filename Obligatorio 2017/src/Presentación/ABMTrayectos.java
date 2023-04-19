package Presentación;

import EntidadesCompartidas.Trayectos;
import Logica.LogicaTrayectos;
import javax.swing.JOptionPane;

public class ABMTrayectos extends javax.swing.JPanel {

    public ABMTrayectos() {
        initComponents();
        ddlsalida.addItem("9:00");
        ddlsalida.addItem("10:00");
        ddlsalida.addItem("11:00");
        ddlsalida.addItem("12:00");
    }

    LogicaTrayectos Logi = new LogicaTrayectos();
    Trayectos mod = new Trayectos();

    private void limpiarCajas() {

        txtid.setText("");
        txtorigen.setText("");
        txtdestino.setText("");
        txtcapacidad.setText("");
        txtprecio.setText("");
        txtid.requestFocus();
        txtid.setEnabled(true);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnguardar.setEnabled(true);
        ddlsalida.setSelectedItem("9:00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtdestino = new javax.swing.JTextField();
        txtcapacidad = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        ddlsalida = new javax.swing.JComboBox<>();
        ddlllegada = new javax.swing.JComboBox<>();
        txtorigen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlimpiar1 = new javax.swing.JButton();

        setOpaque(false);

        jPanel2.setOpaque(false);

        txtdestino.setBackground(new java.awt.Color(0, 0, 51));
        txtdestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdestino.setForeground(new java.awt.Color(255, 255, 255));

        txtcapacidad.setBackground(new java.awt.Color(0, 0, 51));
        txtcapacidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcapacidad.setForeground(new java.awt.Color(255, 255, 255));
        txtcapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcapacidadKeyTyped(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(0, 0, 51));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrop.png"))); // NOI18N
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/registro1.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Destino:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HoraLlegada");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Capacidad:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Origen:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("HoraSalida");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtprecio.setBackground(new java.awt.Color(0, 0, 51));
        txtprecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(255, 255, 255));
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        ddlsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlsalidaActionPerformed(evt);
            }
        });

        ddlllegada.setEnabled(false);

        txtorigen.setBackground(new java.awt.Color(0, 0, 51));
        txtorigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtorigen.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id Trayecto");

        txtid.setBackground(new java.awt.Color(0, 0, 51));
        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papelera1.png"))); // NOI18N
        btneliminar.setBorderPainted(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.setEnabled(false);
        btneliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papeleara2.png"))); // NOI18N
        btneliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Papeleara2.png"))); // NOI18N
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar 1.png"))); // NOI18N
        btnmodificar.setBorderPainted(false);
        btnmodificar.setContentAreaFilled(false);
        btnmodificar.setEnabled(false);
        btnmodificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar 2.png"))); // NOI18N
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba1.png"))); // NOI18N
        btnlimpiar1.setBorderPainted(false);
        btnlimpiar1.setContentAreaFilled(false);
        btnlimpiar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba2.png"))); // NOI18N
        btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdestino)
                            .addComponent(txtcapacidad)
                            .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtorigen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddlsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddlllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlimpiar1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddlsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ddlllegada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlimpiar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcapacidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcapacidadKeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (txtdestino.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno de los campos esta Vacio");
            return;
        } else if (txtcapacidad.getText().isEmpty() || txtprecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno de los campos esta Vacio");
            return;
        } else {
            mod.setorigen(txtorigen.getText());
            mod.sethoraSalida_(ddlsalida.getSelectedItem().toString());
            mod.setdestino(txtdestino.getText());
            mod.sethoraDestino_(ddlllegada.getSelectedItem().toString());
            mod.setcapacidad(Integer.parseInt(txtcapacidad.getText()));
            mod.setprecio(Integer.parseInt(txtprecio.getText()));
            Logi.AgregarTrayectos(mod);
            limpiarCajas();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtid.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "El campo de id esta Vacio",null, JOptionPane.WARNING_MESSAGE);
            limpiarCajas();
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);
            btnguardar.setEnabled(true);
            txtid.requestFocus();
            return;
        }

        EntidadesCompartidas.Trayectos ad = null;
        try {
            int id = Integer.parseInt(txtid.getText());
            ad = Logi.Buscartrayectos(id);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error a en la base de datos",null,JOptionPane.ERROR_MESSAGE);
            limpiarCajas();
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);
            btnguardar.setEnabled(true);
            return;
        }
        if (ad != null) {
            
            ddlllegada.setEnabled(true);
            
            mod = null;
            mod = Logi.Buscartrayectos(Integer.parseInt(txtid.getText()));
            txtorigen.setText(mod.getorigen());
            ddlsalida.setSelectedItem(mod.gethoraSalida_());
            txtdestino.setText(mod.getdestino());
            ddlllegada.setSelectedItem(mod.gethoraDestino_());
            txtcapacidad.setText(Integer.toString(mod.getcapacidad()));
            txtprecio.setText(Integer.toString(mod.getprecio()));

            btnmodificar.setEnabled(true);
            btneliminar.setEnabled(true);
            btnguardar.setEnabled(false);
            txtid.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null,"Este Id de Trayecto no Existe!!",null, JOptionPane.WARNING_MESSAGE);
           // JOptionPane.showMessageDialog(null, "Este Id de Trayecto no Existe!!");
            btnmodificar.setEnabled(false);
            btneliminar.setEnabled(false);
            btnguardar.setEnabled(true);
            limpiarCajas();
            txtid.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        mod.setid(Integer.parseInt(txtid.getText()));
        Logi.EliminarTrayecto(mod);
        limpiarCajas();

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        mod.setid(Integer.parseInt(txtid.getText()));
        mod.setorigen(txtorigen.getText());
        mod.sethoraSalida_(ddlsalida.getSelectedItem().toString());
        mod.setdestino(txtdestino.getText());
        mod.sethoraDestino_(ddlllegada.getSelectedItem().toString());
        mod.setcapacidad(Integer.parseInt(txtcapacidad.getText()));
        mod.setprecio(Integer.parseInt(txtprecio.getText()));
        Logi.ModificarTrayectos(mod);
        
        limpiarCajas();
        txtorigen.setText("");

        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnguardar.setEnabled(true);

        limpiarCajas();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void ddlsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlsalidaActionPerformed

        int posicion;
        ddlllegada.setEnabled(true);
        posicion = ddlsalida.getSelectedIndex();

        switch (posicion) {
            case 0:
                ddlllegada.removeAllItems();
                ddlllegada.addItem("10:00");
                ddlllegada.addItem("11:00");
                ddlllegada.addItem("12:00");
                break;
            case 1:
                ddlllegada.removeAllItems();
                ddlllegada.addItem("11:00");
                ddlllegada.addItem("12:00");
                ddlllegada.addItem("13:00");
                break;
            case 2:
                ddlllegada.removeAllItems();
                ddlllegada.addItem("12:00");
                ddlllegada.addItem("13:00");
                ddlllegada.addItem("14:00");
                break;
            case 3:
                ddlllegada.removeAllItems();
                ddlllegada.addItem("13:00");
                ddlllegada.addItem("14:00");
                ddlllegada.addItem("15:00");
                break;

        }

    }//GEN-LAST:event_ddlsalidaActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();}
    }//GEN-LAST:event_txtidKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();}
    }//GEN-LAST:event_txtprecioKeyTyped

    private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnlimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar1;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> ddlllegada;
    private javax.swing.JComboBox<String> ddlsalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtorigen;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
