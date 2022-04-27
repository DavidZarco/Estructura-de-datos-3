package ar.edu.uner.fcad.ed.ejercicio1;


/**
 *
 * @author stefa
 */
public class ClienteRegex {
    public static void main(String[] args) throws Exception{

        PartidosAdmin partidosAdmin = new PartidosAdmin();      // Recien guardo los partidos en partidosAdmin -----------------------
        partidosAdmin.obtenerDatosCSV("S:\\PremierLeague.csv");
        
        System.out.println("Partidos donde jugó Liverpool: "+partidosAdmin.filtrarPorEquipo(new Equipo("Liverpool")));
        System.out.println("Listado de equipos con puntuacion \n"+partidosAdmin.tablaDePosiciones());
        
        
    
    
    }
}
