package ar.edu.uner.fcad.ed.ejercicio7;

/**
 *
 * @author stefa
 */
public class ClienteSteque {
    public static void main(String[] args) {
    
        Steque<Integer> pila = new Steque();
        pila.isEmpty();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(9);
        System.out.println("Tope:"+pila.top());
        System.out.println("Remueve el tope de la estructura");
        pila.pop();
        System.out.println(pila.top());
        System.out.println("Agrega elemento a tope");
        pila.push(9);
        System.out.println("Tope:"+pila.top());
        System.out.println("El metodo toString:");
        System.out.println(pila.toString());
        System.out.println("Aplicamos enqueue");
        pila.enqueue(12);
        System.out.println("Pila:"+pila);
        System.out.println("Aplicamos el metodo makeEmpty para vaciar la pila");
        pila.makeEmpty();
        if(pila.isEmpty()){
            System.out.println("La pila esta vacia");    
        }else{
            System.out.println("La pila no esta vacia");
        }
    }
}
