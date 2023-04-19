/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;

import java.util.Date;

public class Reservas {

    private int idreservas_;
    private int cantidad_;
    private String fecha_;
    private int Clientecedula_;
    private int IdTrayectos_;
    private boolean pagos_;

    public Reservas(int idreservas_, int cantidad_, String fecha_, int Clientecedula_, int IdTrayectos_, boolean pagos_) {
        this.idreservas_ = idreservas_;
        this.cantidad_ = cantidad_;
        this.fecha_ = fecha_;
        this.Clientecedula_ = Clientecedula_;
        this.IdTrayectos_ = IdTrayectos_;
        this.pagos_ = pagos_;
    }

    public Reservas() {
    }

    public boolean getPago() {
        return pagos_;
    }

    public void setPagos_(boolean pagos_) {
        this.pagos_ = pagos_;
    }

    public int getidreservas() {
        return idreservas_;
    }

    public void setidreservas(int id) {
        this.idreservas_ = id;
    }

    public int getcantidad() {
        return cantidad_;
    }

    public void setcantidad(int cantidad) {
        this.cantidad_ = cantidad;
    }

    public String getfecha() {
        return fecha_;
    }

    public void setfecha(String fecha) {
        this.fecha_ = fecha;
    }

    public int getClientecedula() {
        return Clientecedula_;
    }

    public void setClientecedula(int Clientecedula) {
        this.Clientecedula_ = Clientecedula;
    }

    public int getIdTrayectos() {
        return IdTrayectos_;

    }

    public void setIdTrayectos(int IdTrayectos) {
        this.IdTrayectos_ = IdTrayectos;
    }

}
