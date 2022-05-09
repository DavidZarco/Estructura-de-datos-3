package ar.edu.uner.fcad.ed.ejercicio4;

import java.util.Objects;


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

    NodoListaDoble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    @Override
    public String toString() {
        return "" + elemento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.elemento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NodoListaDoble<?> other = (NodoListaDoble<?>) obj;
        return Objects.equals(this.elemento, other.elemento);
    }
    
    
     
}
