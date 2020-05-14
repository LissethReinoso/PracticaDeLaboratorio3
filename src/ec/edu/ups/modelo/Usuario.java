
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Lisseth Reinoso
 */
public class Usuario {

    public int cedula;
    public String nombre;
    public String apellido;
    public String correo;
    public String contraseña;
    //agregacion
    private Telefono[] telefonos;
    int cont;
    
    public Usuario() {
        telefonos=new Telefono[10];
        cont=0;
    }

    public Usuario(int cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    ///telefono
    public void agregarTelefono(Telefono tel) {
        if (cont < 10) {
            telefonos[cont] = tel;
            cont++;
        } else {
            System.out.println("Has llegado al limite de teléfonos");
        }
    }

    public Telefono[] getTelefonos() {
        return telefonos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.correo);
        hash = 73 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        String telefonos = "";
        for (int i = 0; i < cont; i++) {            
            telefonos += this.telefonos[i] + "\n";            
        }
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contraseña=" + contraseña + '}'+ "\nTeléfonos: " + telefonos;
    }

}
