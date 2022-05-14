/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entyties.Juegos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class CatalogoJuegos {
    
   private List<Juegos> _listaJuegos = new ArrayList();
    
    public void agregarArticulo(Juegos jue){
        this._listaJuegos.add(jue);
    }
    
    public void modificarArticulo(){
        
    }
    
    public void eliminarArticulo(int id){        
       this._listaJuegos.remove(id);
    }
    
    public List<Juegos> listaJuegos() {
        return _listaJuegos;
    }
    
}
