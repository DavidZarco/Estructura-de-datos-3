package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author stefa
 */
public class ClienteListaDoble {
    public static void main (String [] args){
    ListaDoble <String> listadoble = new ListaDoble<String>();
    
    listadoble.add("perro");
    listadoble.add("gato");
    listadoble.add("loro");
    listadoble.add("pez");
    listadoble.add("caballo");
    listadoble.add("conejo");
    listadoble.add("elefante");
    listadoble.add("jirafa");
      
    System.out.println("¿La lista esta vacia?: " + listadoble.isEmpty());
    System.out.println("el tamanio es:" + listadoble.size());
    System.out.println("Lista: "+listadoble.toString());
    System.out.println("La posicion 5 tiene el elemento: " + listadoble.get(5));
    listadoble.remove("conejo");
    System.out.println("Lista sin 'conejo': " + listadoble.toString());
    listadoble.remove("gato");
    System.out.println("Lista sin 'gato': " + listadoble.toString());

    System.out.println("********************* Pruebas con iterador *********************");
    IteradorListaDoble iterador = listadoble.iterador();
    System.out.println("Elemento: " + iterador.siguiente().toString());
    System.out.println("Elemento siguiente: " + iterador.siguiente().toString());
    System.out.println("Elemento siguiente: " + iterador.siguiente().toString());
    System.out.println("Elemento anterior: " + iterador.anterior().toString());
    System.out.println("Ultimo elemento: " + iterador.ultimo().toString());
    System.out.println("Primer elemento: " + iterador.primero().toString());
    }
}