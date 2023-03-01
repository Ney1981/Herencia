
package com.mycompany.herencia;

public class Persona{
    
    public Persona(String nombre){
        this.nombre = nombre;
        
    }
    private String nombre;
    
    public void caminar(){
        System.out.println("La persona camina");
    
    }
    protected void comer(){
        System.out.println("La persona come");
    
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
