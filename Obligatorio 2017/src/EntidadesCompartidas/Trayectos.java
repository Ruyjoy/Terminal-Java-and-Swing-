/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;

/**
 *
 * @author facu
 */
public class Trayectos 
{
    private int idreservas_;
    private String origen_;
    private String HoraSalida_;
    private String destino_;
    private String HoraDestino_;
    private int capacidad_;
    private int precio_;
   
   
    
    public Trayectos(){}
    
    public Trayectos(int Id, String origen, String HoraSalida, String destino, String HoraDestino,int capacidad, int precio) {
        idreservas_ = Id;
        origen_ = origen;
        HoraSalida_ = HoraSalida;
        destino_ = destino;
        HoraDestino_ = HoraDestino;
        precio_ = precio;
        capacidad_ = capacidad;
    }
    
    public int getid()
    {
       return idreservas_;
    }
     public void setid(int id)
    {
       idreservas_= id;
    } 
      public String getorigen()
    {
       return origen_;
    }
    public void setorigen(String origen)
    {
       origen_= origen;
    }
    public String gethoraSalida_()
    {
        return HoraSalida_;
    }
    public void sethoraSalida_(String horaSalida) 
    {
        HoraSalida_ = horaSalida;
    } 
    public String getdestino()
    {
       return destino_;
    }
    public void setdestino(String destino)
    {
       destino_= destino;
    } 
    public String gethoraDestino_() 
    {
        return HoraDestino_;
    }
    public void sethoraDestino_(String horaDestino)
    {
        HoraDestino_ = horaDestino;
    }
    public int getprecio()
    {
       return precio_;
    }
    public void setprecio(int precio)
    {
       precio_= precio;
    } 

   
    public int getcapacidad()
    {
       return capacidad_;
    }
    public void setcapacidad(int capacidad)
    {
      capacidad_= capacidad;
    } 
    
}
