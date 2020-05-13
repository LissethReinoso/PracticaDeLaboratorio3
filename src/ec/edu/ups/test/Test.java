/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.ups.edu.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Test {
    
    public static void main(String[]  args){
        
        Scanner menu=new Scanner(System.in);
        int m;
        System.out.println("MENÚ");
        System.out.println("Registrarse:");
        System.out.println("Iniciar sesión: ");
        
        //vista
        VistaUsuario vista=new VistaUsuario();
        
        //controlador
        ControladorUsuario controlador=new ControladorUsuario(vista);
        //guardar al usuarios através del controlador
        controlador.registrar();
        
        
        //ver telefonos
      
        
    }
}
