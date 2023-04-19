package Presentación;

import EntidadesCompartidas.Reservas;
import EntidadesCompartidas.Trayectos;
import Logica.LogicaCliente;
import Logica.LogicaReservas;
import Logica.LogicaTrayectos;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author facu
 */
public class ABMReserva extends javax.swing.JPanel {

    /**
     * Creates new form ABMReserva
     */
    public ABMReserva() {
        initComponents();
        modelo();
        tabla_general.setVisible(true);
    }

    LogicaReservas Logi = new LogicaReservas();
    Reservas mod = new Reservas();
    Trayectos modtra = new Trayectos();
    LogicaCliente Locli = new LogicaCliente();

    private void limpiarCajas() {

        txtcedula.setText("");
        txtcantidad.setText("");
        txtcedula.requestFocus();
        txtcedula.setEnabled(true);
        btnguardar.setEnabled(true);
        txtfecha.setCalendar(null);

    }

    public DefaultTableModel modelo() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Origen");
        modelo.addColumn("HoraSalida");
        modelo.addColumn("Destino");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Precio");

        LogicaTrayectos Logi = new LogicaTrayectos();
        tabla_general.setModel(modelo);
        Object[] arrReservas = new Object[6];
        for (Trayectos tra : Logi.Listar()) {
            arrReservas[0] = tra.getid();
            arrReservas[1] = tra.getorigen();
            arrReservas[2] = tra.gethoraSalida_();
            arrReservas[3] = tra.getdestino();
            arrReservas[4] = tra.getcapacidad();
            arrReservas[5] = tra.getprecio();
            modelo.addRow(arrReservas);
        }
        return modelo;

    }

    boolean verificarFecha() {
        Date dat = new Date();//Instancia la fecha del sistema
        if (txtfecha.getDate() != null && txtfecha.getDate().getTime() <= dat.getTime()) {//Compara si la fecha seleccionada es mayor o igual a la fecha actual
            return true;
        }
        return false;
    }

    public String fecha() {

        String fecha = txtfecha.getDateFormatString();
        Date date = txtfecha.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(fecha);
        String fnacim = String.valueOf(sdf.format(date));

        return fnacim;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_general = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiar1 = new javax.swing.JButton();

        setOpaque(false);

        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingrese una cedula:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 11, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cedula:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Elija la Fecha ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

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
        jScrollPane1.setViewportView(tabla_general);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 390, 90));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Elija un Trayecto :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad de Pasajes:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        txtcantidad.setBackground(new java.awt.Color(0, 0, 51));
        txtcantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 89, -1));

        txtcedula.setBackground(new java.awt.Color(0, 0, 51));
        txtcedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcedula.setForeground(new java.awt.Color(255, 255, 255));
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 89, -1));

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
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        btnlimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba1.png"))); // NOI18N
        btnlimpiar1.setBorderPainted(false);
        btnlimpiar1.setContentAreaFilled(false);
        btnlimpiar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Escoba2.png"))); // NOI18N
        btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        int filaseleccionada;
        int contador = 0;
        filaseleccionada = tabla_general.getSelectedRow();
        DefaultTableModel modelotabla = (DefaultTableModel) tabla_general.getModel();
        LogicaTrayectos Logia = new LogicaTrayectos();
        int id = (int) modelotabla.getValueAt(filaseleccionada, 0);

        if (contador == 0) {
            for (Reservas res : Logi.BuscarReservascliente(Integer.parseInt(txtcedula.getText()))) {
                if (res.getPago() == false) {
                    contador++;
                }
            }
        }
        if (contador > 3) {

            JOptionPane.showMessageDialog(null, "No puede reservar tiene mas de 3 atrasos");
            return;
        }
        if (txtfecha.getDate() == null || txtcedula.getText().isEmpty() || txtcantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno de los campos o el campos Fecha estan Vacios");
            return;
        } else {
            boolean veri = verificarFecha();

            if (veri == true) {
                JOptionPane.showMessageDialog(null, "La fecha no pude ser anterior a la de hoy");
                return;
            }
        }
        if (filaseleccionada == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        }
        //tomo los asientos
        int Asientos = Integer.parseInt(txtcantidad.getText());
        //tabla tomo el id
        int cantidad = Logia.Buscartrayectos(id).getcapacidad();

        int asientos = Logi.BuscarReservaasiento(id, fecha()).getcantidad();
        int algo = cantidad - asientos;

        if (Asientos > algo) {
            JOptionPane.showMessageDialog(null, "El trayecto tiene todos los asientos vendidos");
            return;
        }
        EntidadesCompartidas.Cliente ad = null;

        try {
            int Cedula = Integer.parseInt(txtcedula.getText());
            ad = Locli.BuscarCliente(Cedula);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error a en la base de datos");
            limpiarCajas();
            return;
        }
        if (ad != null) {

            try {
                mod.setClientecedula(Integer.parseInt(txtcedula.getText()));
                mod.setfecha(fecha());
                mod.setIdTrayectos(id);
                mod.setcantidad(Integer.parseInt(txtcantidad.getText()));
                mod.setPagos_(false);
                Logi.AgregarReserva(mod);
            } catch (HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe Esta Cedula!!");
        }
        limpiarCajas();

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnlimpiar1ActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_general;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables
}
