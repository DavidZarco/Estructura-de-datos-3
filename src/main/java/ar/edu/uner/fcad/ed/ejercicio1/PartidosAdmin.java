package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class PartidosAdmin {
    protected List<Partido> listaPartidos = new ArrayList();
    protected List<EquipoPuntaje> listaEquipos = new ArrayList();

    public PartidosAdmin(){}
    
    public PartidosAdmin(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    
    
    //Devuelve todos los partidos de un equipo.
    public List<Partido> filtrarPorEquipo(Equipo equipo){   // FUNCIONA
        List<Partido> filtrarPorEquipo = new ArrayList();
        for (Partido partido : listaPartidos) {
            if(partido.getLocal().getNombre().equalsIgnoreCase(equipo.getNombre()) || partido.getVisitante().getNombre().equalsIgnoreCase(equipo.getNombre())){
                filtrarPorEquipo.add(partido);
            }
        }
        
        return filtrarPorEquipo;
    }
    
    // Devuelve el equipo que más ganó de local.
    public Equipo fuerteDeLocal(){
        return null;
    }
    
    // Devuelve el equipo que más goles recibió.
    public Equipo problemasDefensivos(){
        return null;
    }
    
    // Devuelve el equipo que más empató.
    public Equipo deportivoEmpate(){
        return null;
    }
  
    public void listarEquipos() {
        Equipo local;
        Equipo visitante;
        boolean existeLocal = false;
        boolean existeVisit = false;
        for (Partido partido : listaPartidos) {
            if(!listaEquipos.isEmpty()){
            for (EquipoPuntaje equipoPuntaje : listaEquipos) {  // PARA EL LOCAL
                if (equipoPuntaje.getEquipo() == partido.getLocal()) {  // Ya que no se repiten los objetos equipo, verifico por direccion de memoria
                    existeLocal = true;
                    // Metodos para agregarle al local
                    equipoPuntaje.setGolesAfavor(equipoPuntaje.getGolesAfavor() + partido.getGolesLocal()); // goles a favor
                    equipoPuntaje.setGolesRecibidos(equipoPuntaje.getGolesRecibidos() + partido.getGolesVisitante()); // goles recibidos
                    if (partido.resultado == ResultadoEnum.H) { // Si gano el local
                        equipoPuntaje.setPartGanados(equipoPuntaje.getPartGanados() + 1);
                    } else {
                        if (partido.resultado == ResultadoEnum.A) { // Si gano el visitante
                            equipoPuntaje.setPartPerdidos(equipoPuntaje.getPartPerdidos() + 1);
                        } else {
                            if (partido.resultado == ResultadoEnum.D) { // Si hubo empate
                                equipoPuntaje.setPartEmpatados(equipoPuntaje.getPartEmpatados() + 1);
                            }
                        }

                    }
                }
                
            }
            }
            if (existeLocal == false) {   // Si no existía el local

                if (partido.resultado == ResultadoEnum.H) { // Si gano el local
                    listaEquipos.add(new EquipoPuntaje(partido.getLocal(), partido.getGolesLocal(), partido.getGolesVisitante(), 1, 0, 0));
                } else {
                    if (partido.resultado == ResultadoEnum.A) { // Si gano el visitante
                        listaEquipos.add(new EquipoPuntaje(partido.getLocal(), partido.getGolesLocal(), partido.getGolesVisitante(), 0, 1, 0));
                    } else {
                        if (partido.resultado == ResultadoEnum.D) { // Si hubo empate
                            listaEquipos.add(new EquipoPuntaje(partido.getLocal(), partido.getGolesLocal(), partido.getGolesVisitante(), 0, 0, 0));
                        }
                    }

                }
            }
            for (EquipoPuntaje equipoPuntaje : listaEquipos) {  // PARA EL VISITANTE
                if (equipoPuntaje.getEquipo() == partido.getVisitante()) {  // Ya que no se repiten los objetos equipo, verifico por direccion de memoria
                    existeLocal = true;
                    // Metodos para agregarle al visitante
                    equipoPuntaje.setGolesAfavor(equipoPuntaje.getGolesAfavor() + partido.getGolesVisitante()); // goles a favor
                    equipoPuntaje.setGolesRecibidos(equipoPuntaje.getGolesRecibidos() + partido.getGolesLocal()); // goles recibidos
                    if (partido.resultado == ResultadoEnum.H) { // Si gano el local
                        equipoPuntaje.setPartPerdidos(equipoPuntaje.getPartPerdidos() + 1);
                    } else {
                        if (partido.resultado == ResultadoEnum.A) { // Si gano el visitante
                            equipoPuntaje.setPartGanados(equipoPuntaje.getPartGanados() + 1);
                        } else {
                            if (partido.resultado == ResultadoEnum.D) { // Si hubo empate
                                equipoPuntaje.setPartEmpatados(equipoPuntaje.getPartEmpatados() + 1);
                            }
                        }
                    }
                }
            }
            
            
            
        }

    }

    // Devuelve en orden descendente los equipos junto con su puntaje.
    public List<EquipoPuntaje> tablaDePosiciones() {
        this.listarEquipos();
        return this.listaEquipos;
    }

}
