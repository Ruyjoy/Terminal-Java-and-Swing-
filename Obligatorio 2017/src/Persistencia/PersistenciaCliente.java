/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import EntidadesCompartidas.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Presentación.Principal;
import java.sql.ResultSet;
import java.util.ArrayList;



public class PersistenciaCliente extends Conexion {
    
    
    
   public boolean AgragarCliente(Cliente cli){ 
       
      Connection con = conexion();
      PreparedStatement pst=null;
      String sql ="INSERT INTO cliente (Cedula,Nombre,Apellido,Direccion,Telefono,Mail)VALUES (?,?,?,?,?,?)";
            
      try {
                pst=con.prepareStatement(sql);
                pst.setInt(1,cli.getcedula());
                pst.setString(2,cli.getnombre());
                pst.setString(3,cli.getapellido());
                pst.setString(4,cli.getdireccio());
                pst.setInt(5, cli.gettelefono());
                pst.setString(6,cli.getmail());
                int n = pst.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"registrado con exito");
                
                }
            return true;
            
        } 
            catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
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
     
   public boolean EliminaCliente(Cliente cli) {
       
       Connection con = conexion();
       PreparedStatement pst=null;
       
       try {
            pst = con.prepareStatement("DELETE FROM cliente WHERE Cedula=?");
            pst.setInt(1,cli.getcedula());
            int n = pst.executeUpdate();
            if (n>0){
                
                JOptionPane.showMessageDialog(null,"Eliminado con exito");
                
            }else {
                 
                JOptionPane.showMessageDialog(null, "Error al eliminar persona");
            
            }
            return true;
            
        } 
       catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede Eliminar Tiene una reserva Asociada");
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
   
   public Cliente BuscarCliente (int Cedula){
       
       Connection con = conexion();
       PreparedStatement pst=null;
 
        Cliente cliente = null;
        ResultSet rs;
        try{
            pst = con.prepareStatement("SELECT * FROM Cliente WHERE Cedula = ?");
            pst.setInt(1,Cedula);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                cliente = new Cliente();
                cliente.setnombre(rs.getString("Nombre"));
                cliente.setapellido(rs.getString("Apellido"));
                cliente.setdireccion(rs.getString("Direccion"));
                cliente.settelefono(rs.getInt("Telefono"));
                cliente.setmail(rs.getString("Mail"));
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
        return cliente;
   }
   
   public boolean ModificarCliente (Cliente cli){
       
       Connection con = conexion();
       PreparedStatement pst=null;
        try {
                pst=con.prepareStatement("UPDATE Cliente SET Nombre=?,Apellido=?,Direccion=?,Telefono=?,Mail=? WHERE Cedula=?");
     
                pst.setString(1,cli.getnombre());
                pst.setString(2,cli.getapellido());
                pst.setString(3,cli.getdireccio());
                pst.setInt(4,cli.gettelefono());
                pst.setString(5,cli.getmail());
                pst.setInt(6,cli.getcedula());
            
                int n = pst.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Modificado con exito");
                
                }else {
                    JOptionPane.showMessageDialog(null,"Error al modificar");
                
                }
            return true;
            
        } 
            catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
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
   
   public ArrayList<Cliente> ListCliente(){

        ArrayList<Cliente> arrcliente = new ArrayList<Cliente>();
        Connection con = conexion();
        PreparedStatement pst = null;
        Cliente cliente = null;

        try {
                if (con != null) {
                pst=con.prepareStatement("SELECT * FROM Cliente");
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    cliente = new Cliente();
                    cliente.setcedula(Integer.parseInt(rs.getString(1)));
                    cliente.setnombre(rs.getString(2));
                    cliente.setapellido(rs.getString(3));
                    cliente.setdireccion(rs.getString(4));
                    cliente.settelefono(Integer.parseInt(rs.getString(5)));
                    cliente.setmail(rs.getString(6));
                    arrcliente.add(cliente);
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
        return arrcliente;
        }
   }
