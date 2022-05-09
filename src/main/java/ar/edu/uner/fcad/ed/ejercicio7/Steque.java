package ar.edu.uner.fcad.ed.ejercicio7;

/**
 *
 * @author stefa
 */
public class Steque<T> implements StequeInterfaz<T> {
    private static final int CAPACIDAD = 10 ;
    protected T[] arreglo;
    protected int tope;
    protected int capacidad;

    public class Steque (Class<T> clazz){
    this(clazz , CAPACIDAD);   
    }
    public class Steque(Class<T> clazz, int capacidad){
    this.capacidad = capacidad;
    this.arreglo = nuevoArreglo(clazz, capacidad);
    makeEmpty();
    }
    private T[] nuevoArreglo(Class<T> clazz, int capacidad){
        return(T[]) Array.newInstance(clazz, capacidad);
    }
    
    
    @Override
    public boolean isEmpty() {
        return tope == null;
    }

    @Override
    public T top() {
        if(isEmpty){
            return null;
        }
    return arreglo[tope];
    }
    

    @Override
    public void enqueue(T elemento) {
    }

    @Override
    public void pop() {
        this.tope--;
    }

    @Override
    public void push(T elemento) {
        if(isFull()){
            return;
        }
        this.arreglo[++tope] = elemento;
    }

    @Override
    public void makeEmpty() {
        this.tope = -1 ;
    }
    public boolean isFull() {
        return tope == capacidad - 1;
    }
    @Override
    public String toString() {
        String resultado = "";
        for (int i = tope; i >= 0; i--) {
            resultado += ", [" + arreglo[i].toString() + "]";
        }
        if (resultado.length() > 0) {
            resultado = resultado.substring(2);
        }
        return resultado;
    }
    
}
