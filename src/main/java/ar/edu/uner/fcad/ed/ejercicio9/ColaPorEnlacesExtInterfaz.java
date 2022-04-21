package src.main.java.ar.edu.uner.fcad.ed.ejercicio9;

public interface ColaPorEnlacesExtInterfaz <T>{
    /** Elimina de la estructura el número de elementos especificado num*/
    public Object multiDequeue(int num);
    /** Reemplaza todas las ocurrencias de param1 con param2 */
    public void reemplazarTodos(T param1, T param2);
    /** Devuelve la cantidad actual de elementos en la estructura. */
    public int size();
    /** Intercambia el elemento del frente con el último. */
    public void exchange();
}