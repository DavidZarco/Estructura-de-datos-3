package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Objects;

/**
 *
 * @author stefa
 */
public class EquipoPuntaje {
    private Equipo equipo;
    private int golesAfavor;
    private int golesRecibidos;
    private int partGanados;
    private int partPerdidos;
    private int partEmpatados;

    public EquipoPuntaje() {
    }

    public EquipoPuntaje(Equipo equipo, int golesAfavor, int golesRecibidos, int partGanados, int partPerdidos, int partEmpatados) {
        this.equipo = equipo;
        this.golesAfavor = golesAfavor;
        this.golesRecibidos = golesRecibidos;
        this.partGanados = partGanados;
        this.partPerdidos = partPerdidos;
        this.partEmpatados = partEmpatados;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getGolesAfavor() {
        return golesAfavor;
    }

    public void setGolesAfavor(int golesAfavor) {
        this.golesAfavor = golesAfavor;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.equipo);
        hash = 47 * hash + this.golesAfavor;
        hash = 47 * hash + this.golesRecibidos;
        hash = 47 * hash + this.partGanados;
        hash = 47 * hash + this.partPerdidos;
        hash = 47 * hash + this.partEmpatados;
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
        final EquipoPuntaje other = (EquipoPuntaje) obj;
        if (this.golesAfavor != other.golesAfavor) {
            return false;
        }
        if (this.golesRecibidos != other.golesRecibidos) {
            return false;
        }
        if (this.partGanados != other.partGanados) {
            return false;
        }
        if (this.partPerdidos != other.partPerdidos) {
            return false;
        }
        if (this.partEmpatados != other.partEmpatados) {
            return false;
        }
        return Objects.equals(this.equipo, other.equipo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EquipoPuntaje{");
        sb.append("equipo=").append(equipo);
        sb.append(", golesAfavor=").append(golesAfavor);
        sb.append(", golesRecibidos=").append(golesRecibidos);
        sb.append(", partGanados=").append(partGanados);
        sb.append(", partPerdidos=").append(partPerdidos);
        sb.append(", partEmpatados=").append(partEmpatados);
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
    
    
    
    
}
