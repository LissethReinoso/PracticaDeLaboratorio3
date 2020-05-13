
package ec.ups.edu.vista;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

public class VistaUsuario {
      private Scanner leer;

    public VistaUsuario() {
        leer=new Scanner(System.in);
    }
    
      public Usuario agregarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("REGISTRARSE");
          System.out.println("Ingrese sus datos: ");
          System.out.print("Cédula: ");
          int cedula=leer.nextInt();
          leer.nextLine();
          System.out.print("Nombre: ");
          String nombre=leer.nextLine();
          System.out.print("Apelllido: ");
          String apellido=leer.nextLine();
          System.out.print("Correo: ");
          String correo=leer.nextLine();
          System.out.print("Contraseña: ");
          String contraseña=leer.nextLine();
          return new Usuario(cedula,nombre,apellido,correo,contraseña);
      }
      
      public Usuario modificarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("MODIFICACIÓN DE DATOS");
          System.out.println("Ingrese su cédula para modificar sus datos: ");
          int cedula=leer.nextInt();
          System.out.println("Ingrese los datos: ");
          System.out.print("Nombre: ");
          String nombre=leer.nextLine();
          leer.nextLine();
          System.out.print("Apellido: ");
          String apellido=leer.nextLine();
          System.out.print("Correo: ");
          String correo=leer.nextLine();
          System.out.print("Contraseña: ");
          String contraseña=leer.nextLine();
          return new Usuario(cedula,nombre,apellido,correo,contraseña);
      }
      public Usuario eliminarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("ELIMINAR USUARIO");
          System.out.println("Ingrese la cédula: ");
          int cedula=leer.nextInt();
          return new Usuario(cedula,null,null,null,null);
      }
      public int buscarUsuario(){
          leer=new Scanner(System.in);
          System.out.println("BUSCAR USUARIO");
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
