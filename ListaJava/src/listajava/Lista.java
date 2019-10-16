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
public class Lista implements ListaInterface{
    
    private NodoLista inicio;
    private int size;

    public Lista() {
        this.inicio = null;
        this.size = 0;
    }       

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getDatos(int posicion) {
       if (posicion >= 1 && posicion <= size) {
           if (posicion == 1) {
               return inicio.getDatos();
           } else {
               NodoLista aux = inicio;
               for (int i = 1; i < posicion; i++) {
                   aux = aux.getSiguiente();
               }
               return aux.getDatos();
           }
       } else {
           return "Posición no existe.";
       }
           
    }

    @Override
    public boolean vacia() {
        return inicio == null;
    }

    @Override
    public void addFinal(String datos) {
        NodoLista nodo = new NodoLista();
        nodo.setDatos(datos);
        if (vacia()) {
            inicio = nodo;
        } else {
            NodoLista aux = inicio;
            while (aux.getSiguiente() != null) {                
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(nodo);
            //inicio = aux;
        }
        size++;
    }

    @Override
    public void addInicio(String datos) {
        NodoLista nodo = new NodoLista();
        nodo.setDatos(datos);
        
        if (vacia()) {
            inicio = nodo;
        } else {
            nodo.setSiguiente(inicio);
            inicio = nodo;
        }
        size++;
    }

    @Override
    public void addReferencia(String ref, String datos) {
        NodoLista nodo = new NodoLista();
        nodo.setDatos(datos);
        if (!vacia()) {
            if (buscar(ref)) {
                NodoLista aux = inicio;
                while (aux.getDatos().equals(ref)) {                    
                    aux = aux.getSiguiente();
                }               
                NodoLista siguiente = aux.getSiguiente();                
                aux.setSiguiente(nodo);                
                nodo.setSiguiente(siguiente);                
                size++;
            }
        }
    }

    @Override
    public void addPosicion(int posicion, String datos) {
        
        if (posicion >= 0 && posicion <= size) {
            NodoLista nodo = new NodoLista();
            nodo.setDatos(datos);
            
            if (posicion == 1) {
                nodo.setSiguiente(inicio);
                inicio = nodo;
            } else {
                if (posicion == size) {
                    NodoLista aux = inicio;
                    NodoLista aux2 = inicio;
                    
                    while (aux.getSiguiente() != null) {                        
                        aux = aux.getSiguiente();
                    }
                    aux2 = aux.getSiguiente();
                    aux.setSiguiente(nodo);
                    aux.setSiguiente(aux2);
                } else {
                    // Agregar el nodo en medio de la lista
                    NodoLista aux = inicio;
                    for (int i = 1; i < (posicion - 1); i++) {
                        aux = aux.getSiguiente();
                    }
                    NodoLista siguiente = aux.getSiguiente();
                    aux.setSiguiente(nodo);
                    nodo.setSiguiente(siguiente);
                }
            }
            size++;
        } else {
            System.out.println("No existe la posición.");
        }
        
    }

    @Override
    public boolean buscar(String datos) {
        NodoLista aux = inicio;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {            
            if (datos.equals(aux.getDatos())) {
                encontrado = true;
            }else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }

    @Override
    public int getPosicion(String datos) throws Exception {
        if (buscar(datos)) {
            NodoLista aux = inicio;
            int contador = 1;
            while (!datos.equals(aux.getDatos())) {                
                contador++;
                aux = aux.getSiguiente();
            }
            return contador;
        } else {
            System.out.println("No se encontro la posición(nodo)");
            throw new Exception("No se encontro la posición(nodo)");
        }
    }

    @Override
    public void editPorReferencia(String ref, String datos) {
        if (buscar(ref)) {
            NodoLista aux = inicio;
            while (!aux.getDatos().equals(ref)) {                
                aux = aux.getSiguiente();
            }
            aux.setDatos(datos);
        } else {
            System.out.println("Dato no encontrado.");
        }
    }

    @Override
    public void editPorPosicion(int posicion, String datos) {
        if (posicion >= 1 && posicion < size) {
            if (posicion == 1) {
                inicio.setDatos(datos);
            } else {
                NodoLista aux = inicio;
                for (int i = 1; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setDatos(datos);
            }
        } else {
            System.out.println("La posición es incorrecta.");
        }
    }

    @Override
    public void deletePorReferencia(String ref) {
        if (buscar(ref)) {
            if (inicio.getDatos().equals(ref)) {
                inicio = inicio.getSiguiente();
            } else {
                NodoLista aux = inicio;
                while (!aux.getSiguiente().getDatos().equals(ref)) {                    
                    aux = aux.getSiguiente();
                }                
                NodoLista siguiente = aux.getSiguiente().getSiguiente();                
                aux.setSiguiente(siguiente);                
                size--;
            }            
        }
    }

    @Override
    public void deletePorPosicion(int posicion) {
        if (posicion == 1) {
            inicio = inicio.getSiguiente();
        } else if (posicion >= 1 && posicion <= size) {
            NodoLista aux = inicio;
            for (int i = 1; i <= posicion; i++) {
                aux = aux.getSiguiente();
            }
            NodoLista siguiente = aux.getSiguiente();
            aux.setSiguiente(siguiente.getSiguiente());
        }
        
        size--;                                                 
    }

    @Override
    public void deleteLista() {
        inicio = null;
        size = 0;
    }

    @Override
    public void showLista() {
        if (!vacia()) {
            NodoLista aux = inicio;
            int i = 1;
            System.out.println("Tamaño lista dentro de show: " + 
                        getSize());
            while (aux != null) {                   
                System.out.println(i + ": " + 
                        aux.getDatos());
                aux = aux.getSiguiente();
                i++;
            }
        } else {
            System.out.println("La lista no contiene datos.");
        }
    }
    
}
