
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.ups.edu.vista.VistaTelefono;
import ec.ups.edu.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class Test {
    
    public static void main(String[]  args){
        
        
        //vista
        VistaUsuario vista=new VistaUsuario();
        VistaTelefono vistat=new VistaTelefono();
        
        //controlador
        ControladorUsuario controlador=new ControladorUsuario(vista);
       ControladorTelefono controladort=new ControladorTelefono(vistat);
        
        
       // controlador.modificar();
        //controlador.eliminar();
        
        //ver telefonos
        Scanner menu=new Scanner(System.in);
        int m;
        System.out.println("MENÚ");
         System.out.println("Ingrese 1 para registrarse");
         System.out.println("Ingrese 2 para iniciar sesión");
         System.out.println("Ingrese 3 para salir ");
         m=menu.nextInt();
         
         if(m<4 && m>0){
             switch(m){
                 case 1:
                     //Registrarse
                     //guardar al usuarios através del controlador
                     controlador.registrar();
                     controlador.verUsuario();
                     //TELEFONO
                     Scanner telefono=new Scanner(System.in);
                     int t;
                     System.out.println("¿Desea registrar teléfonos?");
                     System.out.println("1 SI");
                     System.out.println("2 NO");
                     t=telefono.nextInt();
                     if(t==1){
                         System.out.println("Ingrese los teléfonos");
                         //****TELEFONOS****
                         System.out.println("REGISTRAR TELÉFONO");
                         controladort.registrar();
                         controladort.registrar();
                         
                         //VER LOS TELÉFONOS
                         
                         controladort.verTelefonos();
                     }else{
                         System.out.println("Teléfonos no ingresados");
                     }
                     
                     break;
                 case 2:
                     //Iniciar sesión
                     controlador.verUsuario();
                     
                     break;
                 case 3:
                     System.out.println("A salido del menú");
             }
         }else{
             System.out.println("Ingrese el número correctamente");
         }
        
    }
}
