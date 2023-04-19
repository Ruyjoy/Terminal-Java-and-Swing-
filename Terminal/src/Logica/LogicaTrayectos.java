
package Logica;

import EntidadesCompartidas.Trayectos;
import Persistencia.PersistenciaTrayecto;
import java.util.ArrayList;


public class LogicaTrayectos {
    
    PersistenciaTrayecto modSql = new PersistenciaTrayecto();
    Trayectos trayecto = new Trayectos();
    
    
    public void AgregarTrayectos(Trayectos tra){ 
        
        modSql.AgragarTrayecto(tra);
   }
    
    public void EliminarTrayecto(Trayectos tra){ 
        
        modSql.EliminaTrayecto(tra);
   }
    
    public Trayectos Buscartrayectos (int id){
        
        trayecto = modSql.BuscarTrayectos(id);
        return trayecto;
    }
    
    public void ModificarTrayectos (Trayectos tra){
        
       modSql.ModificarTrayectos(tra);
     
    }
    
    public ArrayList<Trayectos> Listar(){
        
        return modSql.ListTrayectos();
    }
}
