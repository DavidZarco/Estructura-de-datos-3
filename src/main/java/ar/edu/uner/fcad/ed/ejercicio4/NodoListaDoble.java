package ar.edu.uner.fcad.ed.ejercicio4;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

/**
 *
 * @author stefa
 */
public class NodoListaDoble<T>{
    protected T elemento;
    protected NodoListaDoble<T> siguiente;
    protected NodoListaDoble<T> anterior;

    public NodoListaDoble( T elemento) {
        this.elemento = elemento;
    }

    public NodoListaDoble(T elemento, NodoListaDoble<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    public T getElemento(){
        return this.elemento;
    }
    
    public NodoListaDoble<T> getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(NodoListaDoble<T> siguiente){
        this.siguiente = siguiente;
    }
    
    public NodoListaDoble<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoListaDoble<T>anterior ) {
        this.anterior = anterior;
    }
    
    
}
