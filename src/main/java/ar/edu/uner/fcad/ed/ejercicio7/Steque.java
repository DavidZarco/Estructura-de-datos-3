package ar.edu.uner.fcad.ed.ejercicio7;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;
/**
 *
 * @author stefa
 */
public class Steque<T> implements StequeInterfaz<T> {
    
    protected NodoLista<T> tope;

    public Steque(){
        makeEmpty();
    }   
    @Override
    public boolean isEmpty() {
        return tope == null;
    }
    
    @Override
    public T top() {
        if(isEmpty()){
            return null;
        }
    return tope.getElemento();
    }
    
    public void enqueue(T elemento) {
        NodoLista <T> NodoPorAgregar = new NodoLista(elemento);
        if(isEmpty()){
            tope.setSiguiente(NodoPorAgregar);   
        }else{
        NodoLista<T> nodoActual = tope;    
        while(nodoActual.getSiguiente()!=null){
            nodoActual = nodoActual.getSiguiente();
        }    
        nodoActual.setSiguiente(NodoPorAgregar);
        }     
    }

    @Override
    public void pop() {
        this.tope = this.tope.getSiguiente();
    }

    @Override
    public void push(T elemento) {
        if(isEmpty()){
            this.tope = new NodoLista(elemento);
        } else {
            NodoLista<T> nuevoNodo = new NodoLista(elemento);
            nuevoNodo.setSiguiente(tope);
            this.tope = nuevoNodo;
        }
    }

    @Override
    public final void makeEmpty() {
        this.tope = null ;
    }
    public boolean isFull() {
        return false;
    }
    @Override
    public String toString() {
        String resultado = "";
        
        NodoLista<T> nodoActual = tope;
        while(nodoActual != null){
            resultado += ", " + nodoActual.toString();
            nodoActual = nodoActual.getSiguiente();
        }
        
        if(resultado.length() > 0){
            resultado = resultado.substring(2);
        }
        
        return resultado;
    }
    

}
