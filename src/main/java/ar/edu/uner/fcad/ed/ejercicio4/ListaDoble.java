package ar.edu.uner.fcad.ed.ejercicio4;



/**
 *
 * @author stefa
 */
public class ListaDoble<T> implements ListaDobleInterfaz<T>{
    protected NodoListaDoble<T> header;
    @Override
    public boolean isEmpty() {
         return header.getSiguiente()==null;
    }
    
    @Override
    public int size() {
        int size = 0;
        NodoListaDoble<T> aux = header;
        if(aux.getSiguiente()!= null){
            size++;
            aux = aux.getSiguiente();
        }
    }
    
    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void add(T element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void remove(T element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public IteradorListaDoble iterador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
