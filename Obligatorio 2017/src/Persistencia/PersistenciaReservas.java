/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import EntidadesCompartidas.Reservas;
import EntidadesCompartidas.Trayectos;
import Presentación.ABMReserva;
import Presentación.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PersistenciaReservas extends Conexion {

    
      public boolean AgragarReservas(Reservas res){ 
       
      Connection con = conexion();
      PreparedStatement pst=null;
      String sql ="INSERT INTO Reservas (Clientecedula,Fecha,CantidadPasajes,IdTrayectos, pago)VALUES (?,?,?,?,?)";
            
      try {
                pst=con.prepareStatement(sql);
                pst.setInt(1,res.getClientecedula());
                pst.setString(2,res.getfecha());
                pst.setInt(3,res.getcantidad());
                pst.setInt(4,res.getIdTrayectos());
                pst.setBoolean(5,res.getPago());
                
                int n = pst.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"registrado con exito");
                
                }
            return true;
            
        } 
            catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
      
            finally {
                try {   
                    
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}

      
       
                    }       
   }
     
      public boolean EliminaReserva(Reservas res) {
       
       Connection con = conexion();
       PreparedStatement pst=null;
       
       try {
            pst = con.prepareStatement("DELETE FROM Reservas WHERE Id_reservas=?");
            pst.setInt(1,res.getidreservas());
            int n = pst.executeUpdate();
            if (n>0){
                
                JOptionPane.showMessageDialog(null,"Eliminado con exito");
                
            }else {
                 
                JOptionPane.showMessageDialog(null, "Error al eliminar persona");
            
            }
            return true;
            
        } 
       catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
      
       finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}

      
       
                    }       
   }
      
      public Reservas BuscarReservas (int Cedula){
       
       Connection con = conexion();
       PreparedStatement pst=null;
 
        Reservas res = null;
        ResultSet rs;
        try{
            pst = con.prepareStatement("SELECT * FROM Reservas WHERE Clientecedula = ?");
            pst.setInt(1,Cedula);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                res = new Reservas();
                res.setfecha(rs.getString("Fecha"));
                res.setcantidad(rs.getInt("CantidadPasajes"));
                res.setIdTrayectos(rs.getInt("IdTrayectos"));
               }
            
        }
        
        catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
      
        finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}
        }
        return res;
      }
 
      public boolean ModificarReservas (Reservas res){
       
       Connection con = conexion();
       PreparedStatement pst=null;
        try {
                pst=con.prepareStatement("UPDATE Reservas SET Clientecedula=?,Fecha=?,CantidadPasajes=?,IdTrayectos=?,pago=? WHERE Id_reservas=?");
     
                pst.setInt(1, res.getClientecedula());
                pst.setString(2, res.getfecha());
                pst.setInt(3, res.getcantidad());
                pst.setInt(4, res.getIdTrayectos());
                pst.setBoolean(5,res.getPago());
                pst.setInt(6, res.getidreservas());
                
                
            
                int n = pst.executeUpdate();
                if (n>0){
                    
                
              }else {
                    JOptionPane.showMessageDialog(null,"Error al modificar");
                
                }
            return true;
            
        } 
            catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
      
            finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}

      
       
                    }       
   
   
   }
      
      public ArrayList<Reservas> ListReservas(){

        ArrayList<Reservas> arrReservas = new ArrayList<Reservas>();
        Connection con = conexion();
        PreparedStatement pst = null;
        Reservas reservas = null;

        try {
                if (con != null) {
                pst=con.prepareStatement("SELECT * FROM Reservas");
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    reservas = new Reservas();
                    reservas.setidreservas(Integer.parseInt(rs.getString(1)));
                    reservas.setClientecedula(Integer.parseInt(rs.getString(2)));
                    reservas.setfecha(rs.getString(3));
                    reservas.setcantidad(Integer.parseInt(rs.getString(4)));
                    reservas.setIdTrayectos(Integer.parseInt(rs.getString(5)));
                    reservas.setPagos_(Boolean.parseBoolean(rs.getString(6)));
                    arrReservas.add(reservas);
                   }
                }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        return arrReservas;
        }
      
      public ArrayList<Reservas> BuscarReservascedula (int cedula){
       
       ArrayList<Reservas> arrReservas = new ArrayList<Reservas>();   
       Connection con = conexion();
       PreparedStatement pst=null;
 
        Reservas reservas = null;
        ResultSet rs;
        try{
            pst = con.prepareStatement("SELECT Reservas.* FROM Reservas WHERE Clientecedula = ?");
            pst.setInt(1,cedula);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                reservas = new Reservas();
                reservas.setidreservas(Integer.parseInt(rs.getString(1)));
                    reservas.setClientecedula(Integer.parseInt(rs.getString(2)));
                    reservas.setfecha(rs.getString(3));
                    reservas.setcantidad(Integer.parseInt(rs.getString(4)));
                    reservas.setIdTrayectos(Integer.parseInt(rs.getString(5)));
                    arrReservas.add(reservas);
               }
            
        }
        
        catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
      
        finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}
        }
        return arrReservas;
      } 
      
      public Reservas BuscarReservasAsientos (int id, String fecha){
       
       Connection con = conexion();
       PreparedStatement pst=null;
       
        ResultSet rs;
        Reservas reservas = null;
        try{
            pst = con.prepareStatement("SELECT sum(CantidadPasajes) FROM Reservas WHERE IdTrayectos = ? and Fecha = ?");
            pst.setInt(1,id);
            pst.setString(2,fecha);
            
            rs = pst.executeQuery();
            
            while(rs.next()) {
                    reservas = new Reservas();
                    reservas.setcantidad((rs.getInt(1)));
                   }
            
           // total = rs.getString("Total");
            
            
        }
        
        catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
      
        finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}
        }
        return reservas;
      }
      
      public Reservas BuscarReservasAsientostotal (int idres){
       
       Connection con = conexion();
       PreparedStatement pst=null;
       
        ResultSet rs;
        Reservas reservas = null;
        try{
            pst = con.prepareStatement("select CantidadPasajes from obligatorio.Reservas  WHERE  Id_reservas=?");
            pst.setInt(1,idres);

            
            rs = pst.executeQuery();
            
            while(rs.next()) {
                    reservas = new Reservas();
                    reservas.setcantidad(Integer.parseInt(rs.getString(1)));
                    
                   }
            
           // total = rs.getString("Total");
            
            
        }
        
        catch (SQLException ex) {
                Logger.getLogger(ABMReserva.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
      
        finally {
                try {           
                        pst.close();
                        con.close();
                    } 
                catch (SQLException sqle) {}
        }
        return reservas;
      }
      
       public ArrayList<Reservas> ListReservaspagos (boolean pago){

        ArrayList<Reservas> arrReservas = new ArrayList<Reservas>();
        Connection con = conexion();
        PreparedStatement pst = null;
        Reservas reservas = null;

        try {
                if (con != null) {
                pst=con.prepareStatement("SELECT * FROM Reservas Where Pago = ?");
                pst.setBoolean(1,pago);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    reservas = new Reservas();
                    reservas.setidreservas(Integer.parseInt(rs.getString(1)));
                    reservas.setClientecedula(Integer.parseInt(rs.getString(2)));
                    reservas.setfecha(rs.getString(3));
                    reservas.setcantidad(Integer.parseInt(rs.getString(4)));
                    reservas.setIdTrayectos(Integer.parseInt(rs.getString(5)));
                    reservas.setPagos_(rs.getBoolean(6));
                    arrReservas.add(reservas);
                   }
                }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        return arrReservas;
        }

}
