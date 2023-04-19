/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentación;

import EntidadesCompartidas.Reservas;
import EntidadesCompartidas.Trayectos;
import Logica.LogicaCliente;
import Logica.LogicaReservas;
import Logica.LogicaTrayectos;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModificarEliminar extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public ModificarEliminar() {
        initComponents();
    }

    LogicaReservas Logi = new LogicaReservas();
    Reservas mod = new Reservas();
    LogicaCliente LoCliente = new LogicaCliente();

    public DefaultTableModel lista() {
        modelo.addColumn("IdReserva");
        modelo.addColumn("CedulaCliente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad De Pasajes");
        modelo.addColumn("IdTrayecto");
        

        tabla_general.setModel(modelo);
        Object[] arrReservas = new Object[5];
        for (Reservas res : Logi.Listar()) {
            arrReservas[0] = res.getidreservas();
            arrReservas[1] = res.getClientecedula();
            arrReservas[2] = res.getfecha();
            arrReservas[3] = res.getcantidad();
            arrReservas[4] = res.getIdTrayectos();
            modelo.addRow(arrReservas);

        }
        return modelo;

    }

    public DefaultTableModel listacedula(int cedula) {

        modelo.addColumn("IdReserva");
        modelo.addColumn("CedulaCliente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad De Pasajes");
        modelo.addColumn("IdtRayecto");

        Object[] arrReservas = new Object[5];
        for (Reservas res : Logi.BuscarReservascliente(cedula)) {
            arrReservas[0] = res.getidreservas();
            arrReservas[1] = res.getClientecedula();
            arrReservas[2] = res.getfecha();
            arrReservas[3] = res.getcantidad();
            arrReservas[4] = res.getIdTrayectos();
            modelo.addRow(arrReservas);

        }
        return modelo;

    }

    public DefaultTableModel listapago(boolean pago) {

        modelo.addColumn("IdReserva");
        modelo.addColumn("CedulaCliente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad De Pasajes");
        modelo.addColumn("IdtRayecto");

        Object[] arrReservas = new Object[5];
        for (Reservas res : Logi.ListarPagos(pago)) {
            arrReservas[0] = res.getidreservas();
            arrReservas[1] = res.getClientecedula();
            arrReservas[2] = res.getfecha();
            arrReservas[3] = res.getcantidad();
            arrReservas[4] = res.getIdTrayectos();
            modelo.addRow(arrReservas);

        }
        return modelo;

    }

    boolean verificarFecha() {
        Date dat = new Date();//Instancia la TomarFecha del sistema
        if (txtfecha.getDate() != null && txtfecha.getDate().getTime() <= dat.getTime()) {//Compara si la TomarFecha seleccionada es mayor o igual a la TomarFecha actual
            return true;
        }
        return false;
    }

    private void limpiarCajas() {

        txtcedula.setText(null);
        txtidreserva.setText(null);
        txttrayecto.setText(null);
        txtfecha.setCalendar(null);
        txtcantidad.setText(null);
        lblprecio.setText(null);
        btncanselar.setEnabled(false);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnpagar.setEnabled(false);

    }

    public String TomarFecha() {

        String fecha = txtfecha.getDateFormatString();
        Date date = txtfecha.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(fecha);
        String fnacim = String.valueOf(sdf.format(date));

        return fnacim;
    }

    public String Fechaalgo() {

        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fechaalgo = String.valueOf(formateador.format(fechaActual));

        return fechaalgo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txttrayecto = new javax.swing.JTextField();
        txtidreserva = new javax.swing.JTextField();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_general = new javax.swing.JTable();
        btncanselar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        lblprecio = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnpagar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnlistar = new javax.swing.JButton();
        btnpagos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnlistarCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttrayecto.setEnabled(false);
        jPanel1.add(txttrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, -1));

        txtidreserva.setEnabled(false);
        jPanel1.add(txtidreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 88, -1));

        txtfecha.setEnabled(false);
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 120, 30));

        jLabel1.setText("IdReserva");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        tabla_general.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_generalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_general);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 390, 130));

        btncanselar.setText("Canselar Pasaje");
        btncanselar.setEnabled(false);
        btncanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanselarActionPerformed(evt);
            }
        });
        jPanel1.add(btncanselar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btneliminar.setText("Eliminar");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setText("trayecto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setText("cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setText("cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel6.setText("Precio a Pagar:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 88, -1));
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 88, -1));

        lblprecio.setText("$");
        jPanel1.add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        btnpagar.setText("Pagar Reserva");
        btnpagar.setEnabled(false);
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        btnlistar.setText("A Pagar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnpagos.setText("Pagos");
        btnpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagosActionPerformed(evt);
            }
        });

        jLabel7.setText("Listar por pagos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnlistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpagos)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlistar)
                    .addComponent(btnpagos)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        btnlistarCliente.setText("Listar por Cliente");
        btnlistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Listar por Clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnlistarCliente)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnlistarCliente))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 140, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_generalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_generalMouseClicked
        btnlistarCliente.setEnabled(true);
        int filaseleccionada;
        try {
            int filasele = tabla_general.getSelectedRow();
            txtidreserva.setText(tabla_general.getValueAt(filasele, 0).toString());
            txtcedula.setText(tabla_general.getValueAt(filasele, 1).toString());

            SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy");
            Date fechaDate = formato.parse(tabla_general.getValueAt(filasele, 2).toString());
            txtfecha.setDate(fechaDate);

            txtcantidad.setText(tabla_general.getValueAt(filasele, 3).toString());
            txttrayecto.setText(tabla_general.getValueAt(filasele, 4).toString());
            filas = filasele;
            LogicaTrayectos LoTra = new LogicaTrayectos();
            filaseleccionada = tabla_general.getSelectedRow();
            DefaultTableModel modelotabla = (DefaultTableModel) tabla_general.getModel();
            int id = (int) modelotabla.getValueAt(filaseleccionada, 4);
            int precio = LoTra.Buscartrayectos(id).getprecio();
            int cantidadPasajes = (int) modelotabla.getValueAt(filaseleccionada, 3);
            String total = Integer.toString(precio * cantidadPasajes);
            lblprecio.setText(total);

        } catch (ParseException ex) {
            Logger.getLogger(ModificarEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        btncanselar.setEnabled(true);
        btnmodificar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnpagar.setEnabled(true);
    }//GEN-LAST:event_tabla_generalMouseClicked

    private void btncanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanselarActionPerformed
        // TODO add your handling code here:

        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fnacim = String.valueOf(formateador.format(fechaActual));

        Date date = txtfecha.getDate();
        String fecha1 = String.valueOf(formateador.format(date));

        int filaselecionada = tabla_general.getSelectedRow();

        try {

            Date fechaDateActual = formateador.parse(fecha1);
            Date fechaDate1 = formateador.parse(fnacim);

            if (fechaDateActual.before(fechaDate1)) {
                JOptionPane.showMessageDialog(null, "La fecha ya paso su limite");
                return;

            }
            if (filaselecionada >= 0) {

                modelo.removeRow(filaselecionada);
                mod.setidreservas(Integer.parseInt(txtidreserva.getText()));
                Logi.EliminarReserva(mod);
                limpiarCajas();

            } else {
                JOptionPane.showMessageDialog(null, "No seleciono fila");
            }

        } catch (ParseException ex) {
            Logger.getLogger(ModificarEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btncanselarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        int filaselecionada = tabla_general.getSelectedRow();
        if (filaselecionada >= 0) {

            modelo.removeRow(filaselecionada);
            mod.setidreservas(Integer.parseInt(txtidreserva.getText()));
            Logi.EliminarReserva(mod);
            limpiarCajas();

        } else {
            JOptionPane.showMessageDialog(null, "No seleciono fila");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        int filaseleccionada;
        LogicaTrayectos Logia = new LogicaTrayectos();
        Trayectos tra = new Trayectos();
        
        try {
           

            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

            Date date = txtfecha.getDate();
            String fecha1 = String.valueOf(formateador.format(date));

            filaseleccionada = tabla_general.getSelectedRow();

            Date fechaDateActual = formateador.parse(fecha1);
            Date fechaDate1 = formateador.parse(Fechaalgo());

            if (fechaDateActual.before(fechaDate1)) {
                JOptionPane.showMessageDialog(null, "La fecha ya paso su limite");
                return;
            }
            if (filaseleccionada == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

            }

            //tomo los asientos
            int Asientos = Integer.parseInt(txtcantidad.getText());
            //tabla tomo el id

            DefaultTableModel modelotabla = (DefaultTableModel) tabla_general.getModel();
            int id = (int) modelotabla.getValueAt(filaseleccionada, 4);
            int cantidad = Logia.Buscartrayectos(id).getcapacidad();

            int asientos = Logi.BuscarReservaasiento(id, TomarFecha()).getcantidad();
            
            int idreserva = (int) modelotabla.getValueAt(filaseleccionada, 0);
            int totalfecha = Logi.BuscarReservasAsientostotal(idreserva).getcantidad();
            
            int algo = asientos - totalfecha; 
            int total1 = algo + Asientos;
            
            if(total1 > cantidad){
                JOptionPane.showMessageDialog(null, "supera el limite de asientos");
                return;
            }else{

                mod.setidreservas(Integer.parseInt(txtidreserva.getText()));
                mod.setClientecedula(Integer.parseInt(txtcedula.getText()));

                mod.setfecha(TomarFecha());

                mod.setIdTrayectos(Integer.parseInt(txttrayecto.getText()));
                mod.setcantidad(Integer.parseInt(txtcantidad.getText()));
                mod.setPagos_(true);
                Logi.ModificarReservas(mod);

                tabla_general.setModel(new DefaultTableModel());

                btnmodificar.setEnabled(false);
                btncanselar.setEnabled(false);
                
                JOptionPane.showMessageDialog(null,"Modificado con exito");

                limpiarCajas();
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ModificarEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnlistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarClienteActionPerformed

        EntidadesCompartidas.Cliente ad = null;
        if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Cedula esta vacio");
            return;
        }
        try {

            int Cedula = Integer.parseInt(txtcedula.getText());
            ad = LoCliente.BuscarCliente(Cedula);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error a en la base de datos");
            limpiarCajas();
            return;
        }
        if (ad != null) {

            tabla_general.setModel(modelo = new DefaultTableModel());
            int cedula = Integer.parseInt(txtcedula.getText());
            tabla_general.setModel(listacedula(cedula));

        } else {
            JOptionPane.showMessageDialog(null, "No existe Esta Cedula");
            limpiarCajas();
            return;
        }
    }//GEN-LAST:event_btnlistarClienteActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed

        tabla_general.setModel(modelo = new DefaultTableModel());
        tabla_general.setModel(listapago(false));
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        int filaseleccionada;

        try {
            Date fechaActual = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            String fechaalgo = String.valueOf(formateador.format(fechaActual));

            Date date = txtfecha.getDate();
            String fecha1 = String.valueOf(formateador.format(date));

            filaseleccionada = tabla_general.getSelectedRow();

            Date fechaDateActual = formateador.parse(fecha1);
            Date fechaDate1 = formateador.parse(fechaalgo);

            if (fechaDateActual.before(fechaDate1)) {
                JOptionPane.showMessageDialog(null, "La fecha ya paso su limite");
                return;
            }
            if (filaseleccionada == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

            } else {
                
                mod.setidreservas(Integer.parseInt(txtidreserva.getText()));
                mod.setClientecedula(Integer.parseInt(txtcedula.getText()));
                mod.setfecha(TomarFecha());
                mod.setIdTrayectos(Integer.parseInt(txttrayecto.getText()));
                mod.setcantidad(Integer.parseInt(txtcantidad.getText()));
                mod.setPagos_(true);
                Logi.ModificarReservas(mod);

                tabla_general.setModel(new DefaultTableModel());
 
                JOptionPane.showMessageDialog(null, "Fue pagado con exito");
                btnpagar.setEnabled(false);
                limpiarCajas();
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ModificarEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpagarActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9'))evt.consume();
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void btnpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagosActionPerformed

        tabla_general.setModel(modelo = new DefaultTableModel());
        tabla_general.setModel(listapago(true));

    }//GEN-LAST:event_btnpagosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncanselar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnlistarCliente;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnpagar;
    private javax.swing.JButton btnpagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JTable tabla_general;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtidreserva;
    private javax.swing.JTextField txttrayecto;
    // End of variables declaration//GEN-END:variables
int filas;
}
