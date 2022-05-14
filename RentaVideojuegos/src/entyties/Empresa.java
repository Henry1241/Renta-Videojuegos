/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entyties;

/**
 *
 * @author alumnog
 */
public class Empresa {
    
    //Atributos del objeto
    private String nombre = new String();
    private String TipoProductoRenta = new String();
    private String dieccion = new String();
    private String correo = new String();
    private String telefono =  new String();

    //Constructor del objeto
    public Empresa() {
    }

    //Encapculamiento de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDieccion() {
        return dieccion;
    }

    public void setDieccion(String dieccion) {
        this.dieccion = dieccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoProductoRenta() {
        return TipoProductoRenta;
    }

    public void setTipoProductoRenta(String TipoProductoRenta) {
        this.TipoProductoRenta = TipoProductoRenta;
    }
    
}
