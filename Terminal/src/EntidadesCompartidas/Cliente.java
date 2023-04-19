/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesCompartidas;


public class Cliente {
   private int cedula_;
   private String nombre_;
   private String apellido_;
   private String direccion_;
   private int telefono_;
   private String mail_;
   
   public int getcedula()
   {
       return cedula_;
   }
   public void setcedula(int cedula)
   {
       this.cedula_=cedula;
   }
    
   public String getnombre()
   {
       return nombre_;
   }
   public void setnombre(String nombre)
   {
      this.nombre_= nombre;
   } 
   public String getapellido()
   {
       return apellido_;
   }
   public void setapellido(String apellido)
   {
      this.apellido_= apellido;
   } 
   
   public String getdireccio()
   {
       return direccion_;
   }
   public void setdireccion(String direccion)
   {
      this.direccion_= direccion;
   } 
   
   public int gettelefono()
   {
      return telefono_;
   }
   public void settelefono(int telefono)
   {
      this.telefono_=telefono;
   }
   
    public String getmail()
   {
       return mail_;
   }
   public void setmail(String mail)
   {
      this.mail_= mail;
   }     
   public Cliente(){} 
   
   public Cliente(int cedula, String nombre, String apellido, String direccion, int telefono, String mail)
   {
       this.cedula_=cedula;
       this.nombre_=nombre;
       this.apellido_=apellido;
       this.direccion_=direccion;
       this.telefono_=telefono;
       this.mail_=mail;
   }
}
