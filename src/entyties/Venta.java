/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entyties;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alumnog
 */
public class Venta {
    
    
    private int folio = 0;
    private String fecha = new String();
    private String hora = new String();
    private String tipoPago = new String();
    private double subtotal = 0.0;
    private double iva = 0.0;
    private double descuento = 0.0;
    private double total = 0.0;
    private boolean renta = false;
    private Empresa empresa = new Empresa();
    private Persona comprador = new Persona();
    private Persona vendedor = new Persona();
    private List<Juegos> producto = new ArrayList<>();

    public Venta() {
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public List<Juegos> getProducto() {
        return producto;
    }

    public void setProducto(List<Juegos> producto) {
        this.producto = producto;
    }

    public boolean isRenta() {
        return renta;
    }

    public void setRenta(boolean renta) {
        this.renta = renta;
    }

}
