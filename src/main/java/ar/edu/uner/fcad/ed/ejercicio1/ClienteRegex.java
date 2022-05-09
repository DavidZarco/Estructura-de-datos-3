package ar.edu.uner.fcad.ed.ejercicio1;


/**
 *
 * @author stefa
 */
public class ClienteRegex {
    public static void main(String[] args) throws Exception{
        
        PartidosAdmin partidosAdmin = new PartidosAdmin();      // Recien guardo los partidos en partidosAdmin -----------------------
        partidosAdmin.obtenerDatosCSV("S:\\PremierLeague.csv");

        System.out.println("Partidos donde jugó Liverpool: "+partidosAdmin.filtrarPorEquipo(new Equipo("Liverpool"))+"\n");
        
        System.out.println("El equipo que más ganó de local: "+partidosAdmin.fuerteDeLocal()+"\n");
        
       System.out.println("Equipo que más goles recibió: "+partidosAdmin.problemasDefensivos()+"\n");
        
        System.out.println("El equipo que más empates tuvo: "+ partidosAdmin.deportivoEmpate()+"\n");
        
        System.out.println("Listado de equipos con puntuacion \n"+partidosAdmin.tablaDePosiciones()+"\n");
    
    
    }
}
