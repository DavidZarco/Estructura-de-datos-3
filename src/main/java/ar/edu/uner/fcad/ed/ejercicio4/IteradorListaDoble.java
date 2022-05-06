package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author stefa
 * @param <T>
 */
public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {

    protected NodoListaDoble<T> nodoActual;
    
    public IteradorListaDoble(NodoListaDoble<T> header){
        this.nodoActual = header;
    }
    @Override
    public boolean existeSiguiente() {
        return (nodoActual.getSiguiente()!= null);
    }

    @Override
    public T siguiente() {
        T resultado;
        nodoActual = nodoActual.getSiguiente();
        resultado = nodoActual.getElemento();
        return resultado;
    }

    @Override
    public T primero() {
        while (this.existeAnterior()){
            nodoActual = nodoActual.getAnterior();
        }
        return nodoActual.getElemento();
    }
    
    @Override
    public boolean existeAnterior() {
        return nodoActual.getAnterior()!=null;
    }
    
    
    @Override
    public T anterior() {
        if(this.existeAnterior()==false){
            throw new IllegalArgumentException("No tiene anterior");
        }
        nodoActual = nodoActual.getAnterior();
        return nodoActual.getElemento();
    }
    
    @Override
    public T ultimo() {
        while(this.existeSiguiente()){
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual.getElemento();
    }
    
    
}
