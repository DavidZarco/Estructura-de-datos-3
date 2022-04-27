package ar.edu.uner.fcad.ed.ejercicio4;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

/**
 *
 * @author stefa
 */
public class NodoListaDoble<T>{
    protected T elemento;
    protected NodoLista<T> siguiente;
    protected NodoLista<T> anterior;

    public NodoListaDoble( T elemento) {
        this.elemento = elemento;
    }

    public NodoListaDoble(T elemento, NodoLista<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    public T getElemento(){
        return this.elemento;
    }
    
    public NodoLista<T> getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(NodoLista<T> siguiente){
        this.siguiente = siguiente;
    }
    
    public NodoLista<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoLista<T>anterior ) {
        this.anterior = anterior;
    }
    
    
}
