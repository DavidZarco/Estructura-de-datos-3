package ar.edu.uner.fcad.ed.ejercicio7;

/**
 *
 * @author stefa
 */
public class ClienteSteque {
    public static void main(String[] args) {
    
        Steque<Integer> pila = new Steque();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        System.out.println("Pila: "+pila);
       System.out.println("Pila (vaciado): ");
        while (!pila.isEmpty()) {
            System.out.println(pila.top().toString());
            pila.pop();
        }
   
    }
}
