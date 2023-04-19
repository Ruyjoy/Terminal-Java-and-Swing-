package Logica;

import EntidadesCompartidas.Reservas;
import Persistencia.PersistenciaReservas;
import java.util.ArrayList;
import java.util.Date;

public class LogicaReservas {

    PersistenciaReservas modSql = new PersistenciaReservas();
    Reservas reservas = new Reservas();

    public void AgregarReserva(Reservas res) {

        modSql.AgragarReservas(res);
    }

    public void EliminarReserva(Reservas res) {

        modSql.EliminaReserva(res);
    }

    public Reservas BuscarReservas(int cedula) {

        reservas = modSql.BuscarReservas(cedula);
        return reservas;
    }

    public void ModificarReservas(Reservas res) {

        modSql.ModificarReservas(res);

    }
    
    public ArrayList<Reservas> Listar(){
        
       return modSql.ListReservas();
    }
      
    public ArrayList<Reservas> BuscarReservascliente(int cedula){
        
       return  modSql.BuscarReservascedula(cedula);
        
    }
    
     public ArrayList<Reservas> ListarFecha(String fecha){
         
       ArrayList<Reservas> res = modSql.ListReservas(); 
       ArrayList<Reservas> p = new ArrayList<Reservas>(); 
       
       for (Reservas rese : res){
           if (rese.getfecha().equals(fecha)){
              p.add(rese);
           }
       }
           return p;
    }
    
     public Reservas BuscarReservaasiento(int id, String fecha) {

        reservas = modSql.BuscarReservasAsientos(id, fecha);
        return reservas;
    }
     
     public Reservas BuscarReservasAsientostotal (int idreserva) {

        reservas = modSql.BuscarReservasAsientostotal(idreserva);
        return reservas;
    }
     
     public ArrayList<Reservas> ListarPagos(boolean pago){
         ArrayList<Reservas> res = modSql.ListReservaspagos(pago); 
         ArrayList<Reservas> p = new ArrayList<Reservas>();
         
         for(Reservas rese : res){
             
         if(pago == true){
            p.add(rese);
            
        }else if(pago == false){
             p.add(rese);
         }
         }
       return p;
    }
}
