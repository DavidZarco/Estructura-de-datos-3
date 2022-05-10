package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class EquiposDeLocal {
    private Equipo equipo;
    private int victoriasLocal;

    public EquiposDeLocal(Equipo equipo, int victoriasLocal) {
        this.equipo = equipo;
        this.victoriasLocal = victoriasLocal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getVictoriasLocal() {
        return victoriasLocal;
    }

    public void setVictoriasLocal(int victoriasLocal) {
        this.victoriasLocal = victoriasLocal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.equipo);
        hash = 37 * hash + this.victoriasLocal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EquiposDeLocal other = (EquiposDeLocal) obj;
        if (this.victoriasLocal != other.victoriasLocal) {
            return false;
        }
        return Objects.equals(this.equipo, other.equipo);
    }

    @Override
    public String toString() {
        return "EquiposDeLocal{" + "equipo=" + equipo + ", victoriasLocal=" + victoriasLocal + '}'+"\n";
    }
    
    
}
