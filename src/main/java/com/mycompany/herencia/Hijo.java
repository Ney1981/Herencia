
package com.mycompany.herencia;

public class Hijo extends Persona{
 
    public Hijo(String nombre){
        super(nombre);              //constructo de super
    
    }

    @Override                      //Metodo sobre escrito 
    public void caminar() {
        System.out.println("El hijo camina");
    }
    
    public void camina(String s1){
        System.out.println("El hijo camina en "+s1);
    }
    
    public void caminar(double d1){
        System.out.println("El hijo camina" + d1 + "metro");
        
    }
    
}
                