/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author DANIEL
 */
public class NodoListaBusqueda <T> {
    protected NodoListaDoble<T> nodoAnterior;
    protected NodoListaDoble<T> nodoActual;

    public NodoListaBusqueda() {
        this(null, null);
    }

    public NodoListaBusqueda(NodoListaDoble<T> nodoAnterior, NodoListaDoble<T> nodoActual) {
        this.nodoAnterior = nodoAnterior;
        this.nodoActual = nodoActual;
    }

    public void setNodoAnterior(NodoListaDoble<T> nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public void setNodoActual(NodoListaDoble<T> nodoActual) {
        this.nodoActual = nodoActual;
    }
    
}

