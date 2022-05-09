    package ar.edu.uner.fcad.ed.ejercicio9;

/**
 *
 * @author stefa
 */
public class ClienteColaPorEnlaces {
    public static void main(String[] args) {
        ColaPorEnlacesExt<String> cola = new ColaPorEnlacesExt<String>();
        cola.enqueue("arbol");
        cola.enqueue("perro");
        cola.enqueue("gato");
        cola.enqueue("auto");
        cola.enqueue("pez");
        cola.enqueue("auto");
        cola.enqueue("gato");
        cola.enqueue("auto");
        
        System.out.println("Tamanio: "+cola.size());
        System.out.println("toString: "+cola.toString());
        cola.reemplazarTodos("auto", "batman");
        System.out.println("Reemplazo auto por batman: "+cola.toString());
        cola.exchange();
        System.out.println("Intercambio el primer elemento por el ultimo: "+cola.toString());
        
        System.out.println("Hago dequeue de los 3 primeros y los imprimo: "+cola.multiDequeue(3));
        System.out.println("Intercambio el primer elemento por el ultimo: "+cola.toString());
        
    }
}
