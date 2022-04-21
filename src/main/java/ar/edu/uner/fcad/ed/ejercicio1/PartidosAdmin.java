package ar.edu.uner.fcad.ed.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class PartidosAdmin {
    protected List<Partido> listaPartidos = new ArrayList();

    public PartidosAdmin(){}
    
    public PartidosAdmin(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }
    
    
    //Devuelve todos los partidos de un equipo.
    public List<Partido> filtrarPorEquipo(Equipo equipo){
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
    
    // Devuelve en orden descendente los equipos junto con su puntaje.
    public List<EquipoPuntaje> tablaDePosiciones(){
        return null;
    }
    
    // Metodo hecho para corroborar la existencia de un equipo
    public boolean ExisteEquipo(Equipo equipo){
   boolean existe = false;

    for (Partido listaPartido : listaPartidos) {
       if((listaPartido.getVisitante().getNombre().equals(equipo.getNombre())) || (listaPartido.getLocal().getNombre().equals(equipo.getNombre()))){
         existe = true;
         break;
      } 
    }
   return existe;
}
    
}