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

    public static void main(String[] args) {

        //vista
        VistaUsuario vista = new VistaUsuario();
        VistaTelefono vistat = new VistaTelefono();

        //controlador
        ControladorUsuario controlador = new ControladorUsuario(vista);
        ControladorTelefono controladort = new ControladorTelefono(vistat);

        // controlador.modificar();
        //controlador.eliminar();
        //ver telefonos
        Scanner menu = new Scanner(System.in);
        int m;
        System.out.println("MENÚ");
        System.out.println("Ingrese 1 para registrarse");
        System.out.println("Ingrese 2 para iniciar sesión");
        System.out.println("Ingrese 3 para salir ");
        m = menu.nextInt();

        if (m < 4 && m > 0) {
            switch (m) {
                case 1:
                    //Registrarse
                    //guardar al usuarios através del controlador
                    controlador.registrar();
                    controlador.verUsuarios();
                    //TELEFONO
                    Scanner telefono = new Scanner(System.in);
                    int t;
                    System.out.println("¿Desea registrar teléfonos?");
                    System.out.println("1 SI");
                    System.out.println("2 NO");
                    t = telefono.nextInt();
                    if (t == 1) {
                        System.out.println("Ingrese los teléfonos");
                        //****TELEFONOS****
                        System.out.println("REGISTRAR TELÉFONO");
                        controladort.registrar();
                        controladort.registrar();

                        //VER LOS TELÉFONOS
                        controladort.verTelefonos();
                        //MODIFICAR DATOS
                        int modificar;
                        System.out.println("Desea modificar los datos del usuario?");
                        System.out.println("1 SI");
                        System.out.println("2 NO");
                        Scanner mod = new Scanner(System.in);
                        modificar = mod.nextInt();

                        if (modificar < 3 && modificar > 0) {
                            int modificaru;
                            System.out.println("MODIFICACIÓN DE DATOS");
                            System.out.println("Elija 1 para modificar los datos del usuario");
                            System.out.println("Elija 2 para eliminar el usuario");
                            System.out.println("Elija 3 para hacer algún cambio al teléfono");
                            System.out.println("Elija 4 para no hacer ningún cambio");
                            Scanner modu = new Scanner(System.in);
                            modificaru = modu.nextInt();
                            switch (modificaru) {
                                case 1:
                                    controlador.modificar();
                                    controlador.verUsuarios();
                                    controladort.verTelefonos();
                                    break;

                                case 2:
                                    controlador.eliminar();
                                    controladort.verTelefonos();
                                    break;

                                case 3:
                                    //MODIFICAR TELEFONO
                           
                                        System.out.println("MODIFICACIÓN DE TELÉFONOS");
                                        System.out.println("Elija 1 para modificar datos del teléfono");
                                        System.out.println("Elija 2 para eliminiar el teléfono");
                                        System.out.println("Elija 3 para no hacer ningún cambio en los teléfonos");
                                        int modificart;
                                        Scanner modt = new Scanner(System.in);
                                        modificart = modt.nextInt();
                                        switch (modificart) {
                                            case 1:
                                                controladort.modificar();
                                                controladort.verTelefonos();
                                                break;
                                            case 2:
                                                controladort.eliminar();
                                                controladort.verTelefonos();
                                                break;
                                            case 3:
                                                controladort.verTelefonos();
                                                break;
                                        
                            
                                    }
                                    break;

                                case 4:
                                    controlador.verUsuarios();
                                    controladort.verTelefonos();
                            }
                        } else {
                            System.out.println("Ingrese el número correctamente");
                        }
                    } else {
                        System.out.println("Teléfonos no ingresados");
                        controlador.verUsuarios();
                    }

                    break;
                case 2:
                    
                    controlador.iniciarSesion();

                    break;
                case 3:
                    System.out.println("A salido del menú");
            }
        } else {
            System.out.println("Ingrese el número correctamente");
        }

    }
}
