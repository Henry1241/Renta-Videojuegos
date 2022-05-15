/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entyties.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class CatalogoUsuarios {
    
    private List<Persona> _listaPersonas = new ArrayList();
    
    public void agregarUsuario(Persona per){
        this._listaPersonas.add(per);
        
    }
    
    public void login(){
        
    }
    
    public void agregarUsuario(){
        
    }
    
    public void modificarUsuario(){
        
    }
    
    public void eliminarUsuario(){        
       
    }
    
    public void listaUsuarios(){
        
    }
    
    public List<Persona> listaUsuario(){
        return _listaPersonas;
    }
    
    
}
