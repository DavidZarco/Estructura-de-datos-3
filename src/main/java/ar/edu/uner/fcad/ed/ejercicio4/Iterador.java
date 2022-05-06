package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author DANIEL
 */
public interface Iterador<T> {
    /**
     * Indica si existe un nodo siguiente al actual
     * @return 
     */
    public boolean existeSiguiente();
    
    /**
     * Obtiene el siguiente elemento de la estructura.
     * @return 
     */
    public T siguiente();
}