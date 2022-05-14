/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entyties.Juegos;
import entyties.Persona;
import entyties.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class HistorialVentas {
    
    private List<Juegos> juegos = new ArrayList();
    private List<Venta> ventas = new ArrayList();
    private List<Persona> vendedores = new ArrayList();
    private List<Persona> compradores = new ArrayList();

    public boolean registrarSmartphone(Juegos cel) {
        if (cel != null) {//Celalular valido
            this.juegos.add(cel);
            return true;
        }
        return false;
    }

    public boolean aumentarStock(int indice, int ingreso) {
        if (indice > 0) {
            if (this.juegos.get(indice) != null) {
                int stockActual = this.juegos.get(indice).getStock();
                this.juegos.get(indice).setStock(stockActual + ingreso);
                return true;
            }
        }

        return false;

    }
    
    public boolean registrarVenta(Venta venta) {
        if (venta != null) {

            this.ventas.add(venta);

            return true;
        }
        return false;
    }
    
    private List<Venta> _listaVentas = new ArrayList();
    
    public void agregarVenta(){
        
    }
    
    public void modificarVenta(){
        
    }
    
    public void eliminarVenta(){        
       
    }
    
    public void listaVentas(){
        
    }

    public List<Venta> getListaVentas() {
        return _listaVentas;
    }

    public void setListaVentas(List<Venta> _listaVentas) {
        this._listaVentas = _listaVentas;
    }

    public List<Juegos> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juegos> juegos) {
        this.juegos = juegos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Persona> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Persona> vendedores) {
        this.vendedores = vendedores;
    }

    public List<Persona> getCompradores() {
        return compradores;
    }

    public void setCompradores(List<Persona> compradores) {
        this.compradores = compradores;
    }
    
    
}
