
package ec.ups.edu.vista;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.modelo.*;
import java.util.List;
import java.util.Scanner;

public class VistaUsuario {
      private Scanner leer;

    public VistaUsuario() {
        leer=new Scanner(System.in);
    }
    
      public Usuario agregarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("Ingrese sus datos: ");
          int cedula=leer.nextInt();
          String nombre=leer.nextLine();
          String apellido=leer.nextLine();
          String correo=leer.nextLine();
          String contraseña=leer.nextLine();
          return new Usuario(cedula,nombre,apellido,correo,contraseña);
      }
      
      public Usuario modificarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("Ingrese su cédula para modificar sus datos: ");
          int cedula=leer.nextInt();
          System.out.println("Ingrese los datos: ");
          String nombre=leer.nextLine();
          String apellido=leer.nextLine();
          String correo=leer.nextLine();
          String contraseña=leer.nextLine();
          return new Usuario(cedula,nombre,apellido,correo,contraseña);
      }
      public Usuario eliminarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("Ingrese la cédula: ");
          int cedula=leer.nextInt();
          return new Usuario(cedula,null,null);
      }
      public int buscarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("Ingrese el usuario a buscar");
          int cedula=leer.nextInt();
          return cedula;
      }
      
      public void verUsuario(Usuario usuario){
          System.out.println("USUARIO: "+usuario);
      }
      
      public void verUsuarios(List<Usuario> usuarios){
          for(Usuario usuario:usuarios){
              System.out.println("DATOS DE LOS USUARIOS: "+usuario);
          }
      }
      
     
}
