/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entyties;

/**
 *
 * @author alumnog
 */
public class Persona {

    //Atributos del objeto
    private int numeroControl = 0;
    private String nombre = new String();
    private String direccion = new String();
    private int edad = 0;
    private boolean renta = false;
    private String telefono = new String();
    private String usuario = new String();
    private String correoElectronico = new String();

    //Constructor del objeto
    public Persona() {
    }

    //Encapsulamiento de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public boolean isRenta() {
        return renta;
    }

    public void setRenta(boolean renta) {
        this.renta = renta;
    }

}
