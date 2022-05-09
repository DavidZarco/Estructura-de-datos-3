package ar.edu.uner.fcad.ed.ejercicio4;

import java.util.Objects;



/**
 *
 * @author stefa
 */
public class ListaDoble<T> implements ListaDobleInterfaz<T>{
    protected NodoListaDoble<T> header;
      
    public ListaDoble() {
        this.header = new NodoListaDoble(null);
    }
        @Override
    public boolean isEmpty() {
         return header.getSiguiente()==null;
    }
    
    @Override
    public int size() {
        int size = 0;
        NodoListaDoble<T> aux = header;
        while(aux.getSiguiente()!= null){
            size++;
            aux = aux.getSiguiente();
        }
        return size;
    }
    
    
    @Override
    public T get(int index) {
        NodoListaDoble<T> aux = header;
     if(!isEmpty() && this.size()>index){
         for (int i = 0; i < index; i++) {
             aux = aux.getSiguiente();
         }
     }   
     return aux.elemento;
    }
    
    @Override
    public void add(T element) {
       NodoListaDoble<T> nodoPorAgregar = new NodoListaDoble(element);
       if(isEmpty()){
           this.header.siguiente = nodoPorAgregar;
       }else{
           
           NodoListaDoble<T> nodoActual = header;
       while(nodoActual.siguiente!=null){
           nodoActual = nodoActual.siguiente;
       }
       nodoPorAgregar.setAnterior(nodoActual);
       nodoActual.setSiguiente(nodoPorAgregar);
       }
      
    }
    
    @Override
    public void remove(T element) {
    NodoListaDoble <T> aux = header;
    NodoListaDoble <T> previo = null;
        if (isEmpty()){
            throw new IllegalArgumentException("La lista no posee elementos para eliminar");
        } else {
        while (aux.getSiguiente() != null){
            if (aux.getElemento().equals(element)){
              previo.siguiente = aux.siguiente;
              aux.siguiente = aux.anterior;
            }
            aux = aux.getSiguiente();
        }
    }     
    }
    
    @Override
    public IteradorListaDoble iterador() {
         return new IteradorListaDoble(this.header);
    }
    
     @Override
        public String toString() {
        String resultado = "";

        if (isEmpty()) {
            return resultado;
        }

        NodoListaDoble<T> nodoActual = this.header.siguiente;
        while (nodoActual != null) {
            resultado += ", " + nodoActual.toString();
            nodoActual = nodoActual.siguiente;
        }

        return resultado.substring(2);
    }

  
}
