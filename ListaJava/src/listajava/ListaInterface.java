/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajava;

/**
 *
 * @author Docente AT-4
 */
public interface ListaInterface {
        
        // Obtenemos el tamaño de la lista
        public int getSize();
        // Obtenemos los datos de un nodo de la lista.
        public String getDatos(int posicion);
        // Comprobamos si la lista esta vacía.
        public boolean vacia();
        // Agregamos un nodo al final de la lista.
        public void addFinal(String datos);
        // Agregamos un nodo al principio de la lista.
        public void addInicio(String datos);
        // Agregamos un nodo por referencia.
        public void addReferencia(String ref, String datos);
        // Agregmos un nodo por posición.
        public void addPosicion(int posicion, String datos);
        // Buscamos si existe un nodo.
        public boolean buscar(String datos);
        // Obtenemos la posición de un dato.
        public int getPosicion(String datos);
        // Editamos los datos por referencia.
        public void editPorReferencia(String ref, String datos);
        // Editamos los datos por posición.
        public void editPorPosicion(int posicion, String datos);
        //Eliminamos nodo por referencia.
        public void deletePorReferencia(String ref);
        //Eliminamos nodo por posicion.
        public void deletePorPosicion(int posicion);
        //Eiminamos toda la lista.
        public void deleteLista();
        //Mostrar lista.
        public void showLista();
}
