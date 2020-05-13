/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

public class VistaTelefono {

    private Scanner leer;

    public VistaTelefono() {
        leer = new Scanner(System.in);
    }

    public Telefono agregarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("REGISTRAR TELÉFONO");
        System.out.println("Ingrese los datos: ");
        System.out.print("Código: ");
        int codigo = leer.nextInt();
        leer.nextLine();
        System.out.print("Número: ");
        String numero = leer.nextLine();
        System.out.print("Tipo: ");
        String tipo = leer.nextLine();
        System.out.print("Operadora: ");
        String operadora = leer.nextLine();
        return new Telefono(codigo, numero, tipo, operadora);

    }

    public Telefono modificarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("MODIFICACIÓN DE DATOS DEL TELÉFONO");
        System.out.println("Ingrese el código del teléfono para modificar datos: ");
        int codigo = leer.nextInt();
        System.out.println("Ingrese los datos: ");
        System.out.print("Número: ");
        String numero = leer.nextLine();
        leer.nextLine();
        System.out.print("Tipo: ");
        String tipo = leer.nextLine();
        System.out.print("Operadora: ");
        String operadora = leer.nextLine();
        return new Telefono(codigo, numero, tipo, operadora);
    }

    public Telefono eliminarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("ELIMINAR TELÉFONO");
        System.out.println("Ingrese el código del teléfono: ");
        int codigo = leer.nextInt();
        return new Telefono(codigo, null, null, null);
    }

    public int buscarTelefono() {
        leer = new Scanner(System.in);
        System.out.println("BUSCAR TELÉFONO");
        System.out.println("Ingrese el telefono a buscar");
        int codigo = leer.nextInt();
        return codigo;
    }

    public void verTelefono(Telefono telefono) {
        System.out.println("TELÉFONO: " + telefono);
    }

    public void verTelefonos(List<Telefono> telefonos) {
        for (Telefono telefono : telefonos) {
            System.out.println("TELÉFONOS: " + telefono);
        }
    }
}
