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
public interface PilaInterface {
    
    public void push(String datos);
    public String pop();
    public String peek();
    public boolean vacia();
    public int size();
    
}
