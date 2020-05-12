/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class Test {
    
    public static void main(String[]  args){
        
        Usuario usuario=new Usuario();
        Telefono telefono=new Telefono();
        usuario.setCedula(02134);
        usuario.setNombre("Marco");
        usuario.setApellido("Molina");
        usuario.setCorreo("Lreinosob1@est.ups.edu.ec");
        usuario.setContraseña("wieeiqwq");
        telefono.setNumero("1229192");
        telefono.setCodigo(12);
        telefono.setOperadora("Movistar");
        telefono.setTipo("Celular");
        usuario.agregarTelefono(telefono);
        
        System.out.println(usuario);
        
        
    }
}
