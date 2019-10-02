/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilajava;

/**
 *
 * @author Sistemas
 */
public class PilaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        System.out.println("Pila vacia: " + 
                pila.vacia());
        
        pila.push("Pedro");
        pila.push("Pablo");
        pila.push("Adrian");
        
        System.out.println("Cima de pila: " + 
                pila.peek());
        
        System.out.println("Elementos dentro de la pila: " +
                pila.size());
        
        System.out.println("Elemento eliminado: " +
                pila.pop());
        
        System.out.println("Cima de pila: " + 
                pila.peek());
        
        System.out.println("Elementos dentro de la pila: " +
                pila.size());
        
        
    }
    
}
