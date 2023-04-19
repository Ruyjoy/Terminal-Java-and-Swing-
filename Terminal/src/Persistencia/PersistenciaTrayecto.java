
package Persistencia;

import EntidadesCompartidas.Trayectos;
import Presentación.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PersistenciaTrayecto extends Conexion {
    
    public boolean AgragarTrayecto(Trayectos tra){ 
       
      Connection con = conexion();
      PreparedStatement pst=null;
      String sql ="INSERT INTO Trayecto (Origen,HoraSalida,Destino,HoraDestino,Capacidad,Precio)VALUES (?,?,?,?,?,?)";
            
      try {
                pst=con.prepareStatement(sql);
                pst.setString(1,tra.getorigen());
                pst.setString(2,tra.gethoraSalida_());
                pst.setString(3,tra.getdestino());
                pst.setString(4,tra.gethoraDestino_());
                pst.setInt(5,tra.getcapacidad());
                pst.setInt(6,tra.getprecio());
                
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
    
    public boolean EliminaTrayecto(Trayectos tra) {
       
       Connection con = conexion();
       PreparedStatement pst=null;
       
       try {
            pst = con.prepareStatement("DELETE FROM Trayecto WHERE Id=?");
            pst.setInt(1,tra.getid());
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
    
    public Trayectos BuscarTrayectos (int Id){
       
       Connection con = conexion();
       PreparedStatement pst=null;
 
        Trayectos tra = null;
        ResultSet rs;
        try{
            pst = con.prepareStatement("SELECT * FROM Trayecto WHERE Id = ?");
            pst.setInt(1,Id);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                tra = new Trayectos();
                tra.setorigen(rs.getString("Origen"));
                tra.sethoraSalida_(rs.getString("HoraSalida"));
                tra.setdestino(rs.getString("Destino"));
                tra.sethoraDestino_(rs.getString("HoraDestino"));
                tra.setcapacidad(rs.getInt("Capacidad"));
                tra.setprecio(rs.getInt("Precio"));
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
        return tra;
   }
   
    public boolean ModificarTrayectos (Trayectos tra){
       
       Connection con = conexion();
       PreparedStatement pst=null;
        try {
                pst=con.prepareStatement("UPDATE Trayecto SET Origen=?,HoraSalida=?,Destino=?,HoraDestino=?,Capacidad=?,Precio=? WHERE Id=?");
     
                pst.setString(1,tra.getorigen());
                pst.setString(2, tra.gethoraSalida_());
                pst.setString(3, tra.getdestino());
                pst.setString(4, tra.gethoraDestino_());
                pst.setInt(5, tra.getcapacidad());
                pst.setInt(6, tra.getprecio());
                pst.setInt(7, tra.getid());
            
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
    
    public ArrayList<Trayectos> ListTrayectos(){

        ArrayList<Trayectos> arrTrayectos = new ArrayList<Trayectos>();
        Connection con = conexion();
        PreparedStatement pst = null;
        Trayectos trayectos = null;

        try {
                if (con != null) {
                pst=con.prepareStatement("SELECT * FROM Trayecto");
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    trayectos = new Trayectos();
                    trayectos.setid(Integer.parseInt(rs.getString(1)));
                    trayectos.setorigen(rs.getString(2));
                    trayectos.sethoraSalida_(rs.getString(3));
                    trayectos.setdestino(rs.getString(4));
                    trayectos.sethoraDestino_(rs.getString(5));
                    trayectos.setcapacidad(Integer.parseInt(rs.getString(6)));
                    trayectos.setprecio(Integer.parseInt(rs.getString(7)));
                    arrTrayectos.add(trayectos);
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
        return arrTrayectos;
        }
    
}
