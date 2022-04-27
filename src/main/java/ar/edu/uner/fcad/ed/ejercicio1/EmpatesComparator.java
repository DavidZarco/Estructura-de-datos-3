package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.Comparator;

/**
 *
 * @author stefa
 */
public class EmpatesComparator implements Comparator<EquipoPuntaje> {
    @Override
    public int compare(EquipoPuntaje o1, EquipoPuntaje o2) {
        
        if (o1 == null && o2 == null) {
            return 0;
        } else {
            if (o1 != null && o2 == null) {
                return 1;
            } 
            
            if (o1 == null && o2 != null) {
                return -1;
            }
        }

        int resultado = -1;

        if (o1 != null && o2 != null) {
            if (o1.getPartEmpatados()< o2.getPartEmpatados()) {
                resultado = -1;
            }
            if (o1.getPartEmpatados() == o2.getPartEmpatados()) {
                resultado = 0;
            }
            if (o1.getPartEmpatados() > o2.getPartEmpatados()) {
                resultado = 1;
            }

        }

        return resultado;
    }
}
