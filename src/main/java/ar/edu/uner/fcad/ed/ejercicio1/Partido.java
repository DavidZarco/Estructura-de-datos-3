package src.main.java.ar.edu.uner.fcad.ed.ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author stefa
 */
public class Partido {
    LocalDate fecha;
    Equipo local;
    Equipo visitante;
    int golesLocal;
    int golesVisitante;
    ResultadoEnum resultado;

    public Partido(LocalDate fecha, Equipo local, Equipo visitante, int golesLocal, int golesVisitante, ResultadoEnum resultado) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.resultado = resultado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.local);
        hash = 97 * hash + Objects.hashCode(this.visitante);
        hash = 97 * hash + this.golesLocal;
        hash = 97 * hash + this.golesVisitante;
        hash = 97 * hash + Objects.hashCode(this.resultado);
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
        final Partido other = (Partido) obj;
        if (this.golesLocal != other.golesLocal) {
            return false;
        }
        if (this.golesVisitante != other.golesVisitante) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.visitante, other.visitante)) {
            return false;
        }
        return this.resultado == other.resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partido{");
        sb.append("fecha=").append(fecha);
        sb.append(", local=").append(local);
        sb.append(", visitante=").append(visitante);
        sb.append(", golesLocal=").append(golesLocal);
        sb.append(", golesVisitante=").append(golesVisitante);
        sb.append(", resultado=").append(resultado);
        sb.append('}');
        return sb.toString();
    }
    
}
