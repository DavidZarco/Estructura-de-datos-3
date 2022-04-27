package ar.edu.uner.fcad.ed.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stefa
 */
public class PartidosAdmin {

    protected List<Partido> listaPartidos = new ArrayList();
    protected List<EquipoPuntaje> listaEquipos = new ArrayList();

    public PartidosAdmin() {
    }

    public PartidosAdmin(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    //Devuelve todos los partidos de un equipo.
    public List<Partido> filtrarPorEquipo(Equipo equipo) {   // FUNCIONA
        List<Partido> filtrarPorEquipo = new ArrayList();
        for (Partido partido : listaPartidos) {
            if (partido.getLocal().getNombre().equalsIgnoreCase(equipo.getNombre()) || partido.getVisitante().getNombre().equalsIgnoreCase(equipo.getNombre())) {
                filtrarPorEquipo.add(partido);
            }
        }

        return filtrarPorEquipo;
    }

    // Devuelve el equipo que más ganó de local.
    public Equipo fuerteDeLocal() {
        return null;
    }

    // Devuelve el equipo que más goles recibió.
    public Equipo problemasDefensivos() {
        return null;
    }

    // Devuelve el equipo que más empató.
    public Equipo deportivoEmpate() {
        return null;
    }

    public void listarEquipos() {
        Equipo local;
        Equipo visitante;
        boolean existeLocal = false;
        boolean existeVisit = false;
        for (Partido partido : listaPartidos) {
            if (!listaEquipos.isEmpty()) {
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

    public void obtenerDatosCSV(String direccion) throws Exception {
        final String regex = "^.*,(\\d{2})/(\\d{2})/(\\d{4}),.{5},([A-z]+),([A-z]+),(\\d+),(\\d+),([A-Z]{1}).*$";
        File archivo = new File(direccion);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        try {
            Pattern pattern = Pattern.compile(regex);
            String linea;

            linea = br.readLine();
            System.out.println("Obteniendo una de sus lineas:\n" + linea);
            Matcher matcher;

            Partido partidoAux = new Partido();
            Equipo equipoAuxVisit;
            Equipo equipoAuxLocal;

            while ((linea = br.readLine()) != null) {

                matcher = pattern.matcher(linea);
                if (matcher.matches()) {
                    //System.out.println("***************");

                    int dia = Integer.parseInt(matcher.group(1));
                    //System.out.println("EL DIA ES: "+dia);

                    int mes = Integer.parseInt(matcher.group(2));
                    //System.out.println("EL MES ES: "+mes);

                    int anio = Integer.parseInt(matcher.group(3));
                    //System.out.println("EL ANIO ES: "+anio);

                    String local = matcher.group(4);
                    //System.out.println("Local : "+local);

                    String visitante = matcher.group(5);
                    //System.out.println("Visitante: "+visitante);

                    int golesLocal = Integer.parseInt(matcher.group(6));
                    //System.out.println("Goles local: "+golesLocal);

                    int golesVisitante = Integer.parseInt(matcher.group(7));
                    //System.out.println("Goles Visitante: "+golesVisitante);
                    //System.out.println("Matcheo octavo grupo(FTR): "+matcher.group(8));

                    // Me fijo si ya existe el VISITANTE
                    equipoAuxVisit = new Equipo(matcher.group(5));
                    for (Partido partido : listaPartidos) {
                        if ((partido.getVisitante().getNombre().equals(matcher.group(5)))) {
                            equipoAuxVisit = partido.getVisitante();
                            System.out.println("El equipo visitante " + matcher.group(5) + " ya existe.");
                        } else {
                            if ((partido.getLocal().getNombre().equals(matcher.group(5)))) {
                                equipoAuxVisit = partido.getLocal();
                                System.out.println("El equipo local " + matcher.group(5) + " ya existe.");
                            }
                        }
                    }
                    
                    // Me fijo si ya existe el LOCAL
                    equipoAuxLocal = new Equipo(matcher.group(4));
                    for (Partido partido : listaPartidos) {
                        if ((partido.getVisitante().getNombre().equals(matcher.group(4)))) {
                            equipoAuxLocal = partido.getVisitante();
                        } else {
                            if ((partido.getLocal().getNombre().equals(matcher.group(4)))) {
                                equipoAuxLocal = partido.getLocal();
                            }
                        }
                    }

                    if (matcher.group(8).equals("D")) {
                        partidoAux = new Partido(LocalDate.of(anio, Month.of(mes), dia), equipoAuxLocal, equipoAuxVisit, golesLocal, golesVisitante, ResultadoEnum.D);
                    } else {
                        if (matcher.group(8).equals("A")) {
                            partidoAux = new Partido(LocalDate.of(anio, Month.of(mes), dia), equipoAuxLocal, equipoAuxVisit, golesLocal, golesVisitante, ResultadoEnum.A);
                        } else {
                            if (matcher.group(8).equals("H")) {
                                partidoAux = new Partido(LocalDate.of(anio, Month.of(mes), dia), equipoAuxLocal, equipoAuxVisit, golesLocal, golesVisitante, ResultadoEnum.A);
                            }
                        }
                    }
                    this.listaPartidos.add(partidoAux);

                }
            }

        } catch (Exception e) {

        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    // Devuelve en orden descendente los equipos junto con su puntaje.
    public List<EquipoPuntaje> tablaDePosiciones() {
        this.listarEquipos();
        return this.listaEquipos;
    }

}
