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
public class Pila implements PilaInterface{
    
    private PilaNodo top;

    @Override
    public void push(String datos) {
        PilaNodo nodo = new PilaNodo(datos);
        if (top == null) {
            top = nodo;
        } else {
            nodo.setSiguiente(top);
            top = nodo;
        }
    }

    @Override
    public String pop() {
        PilaNodo aux = top;
        top = top.getSiguiente();
        return aux.getDatos();
    }

    @Override
    public String peek() {
        if (top != null) {
            return top.getDatos();
        } else {
            return "La pila esta vacía.";
        }
    }

    @Override
    public boolean vacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
