/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import EntidadesCompartidas.Cliente;
import Persistencia.PersistenciaCliente;
import java.util.ArrayList;

public class LogicaCliente {   
    
    PersistenciaCliente modSql = new PersistenciaCliente();
    Cliente cliente = new Cliente();
    
    
    public void AgregarCliente(Cliente cli){ 
        
        modSql.AgragarCliente(cli);
   }
    
    public void EliminarCliente(Cliente cli){
 
        this.cliente.setcedula(cliente.getcedula());
        modSql.EliminaCliente(this.cliente);
    }
    
    public Cliente BuscarCliente (int cedula){
        
        cliente = modSql.BuscarCliente(cedula);
        return cliente;
    }
    
    public void ModificarCliente (Cliente cli){
        
       modSql.ModificarCliente(cliente);
        
         
    }
    
    public ArrayList<Cliente> Listar(){
        
        return modSql.ListCliente();
    
    
    }
}
