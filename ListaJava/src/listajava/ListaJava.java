/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajava;

/**
 *
 * @author Sistemas
 */
public class ListaJava {
    static Lista  lista;
    public static void main(String[] args) throws Exception {
         lista = new Lista();        
        System.out.println("Inicio lista.");        
        lista.addInicio("A");
        lista.addFinal("B");
        lista.addFinal("C");        
        System.out.println("Mostrar posicion: " 
                + lista.getDatos(4));        
        mostrarDatos();        
        lista.addInicio("D");
        mostrarDatos();
        lista.addFinal("E");
        mostrarDatos();
        lista.addPosicion(5, "F"); // Tarea
        mostrarDatos();
        lista.addReferencia("D", "X"); //Tarea
        mostrarDatos();
        System.out.println("Buscar: " + lista.buscar("B"));
        System.out.println("Obtener posición: " + lista.getPosicion("X"));
        lista.editPorReferencia("E", "Y");
        mostrarDatos();
        lista.editPorPosicion(3, "Nuevo");
        mostrarDatos();
        lista.deletePorReferencia("Nuevo");
        mostrarDatos();
        lista.deletePorPosicion(2); //Tarea
        mostrarDatos();
        lista.deleteLista();
        mostrarDatos();
        
        
    }    
    public static void mostrarDatos() {
         System.out.println("Tamaño: " 
                + lista.getSize());
        System.out.println("Imprimir lista: " );
        lista.showLista();
    }
    
}
