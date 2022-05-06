package ar.edu.uner.fcad.ed.ejercicio9;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

/**
 *
 * @author stefa
 */
public class ColaPorEnlacesExt<T> extends ColaPorEnlaces<T> implements ColaPorEnlacesExtInterfaz<T>{

    @Override
    public ListaEnlazadaNoOrdenada<T> multiDequeue(int num) {
        ListaEnlazadaNoOrdenada<T> listaAux = new ListaEnlazadaNoOrdenada<T>();
        for (int i = 0; i < num; i++) {
            listaAux.addToRear(this.front.getElemento());
            super.dequeue();
        }
        return listaAux;
    }

    @Override
    public void reemplazarTodos(T param1, T param2) {
     NodoLista<T> aux = this.front;
        for (int i = 0; i < this.size(); i++) {
            if(aux.getElemento().equals(param1)){
                aux.setElemento(param2);
            }
            aux = aux.getSiguiente();
        }
    }

    @Override
    public int size() {
        NodoLista<T> aux = this.front;
        if(isEmpty()){
            return 0;
        }
        int size = 1;
        while(aux.getSiguiente()!=null){ // Mientras haya un siguiente
            size++;
            aux = aux.getSiguiente();
        }
        return size;
    }

    @Override
    public void exchange() {
        T elemAux = this.front.getElemento();
        this.front.setElemento(this.back.getElemento());
        this.back.setElemento(elemAux);
    }
    
}
