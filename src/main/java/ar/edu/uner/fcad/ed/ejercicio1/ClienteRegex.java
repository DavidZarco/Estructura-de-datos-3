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
public class ClienteRegex {
    public static void main(String[] args) throws Exception {

        // String regex = "(\\d{2})[-/](\\dd\\d)[-/](\\d\d\d\d)" ruta relativa de  raiz proyecto
        
        // REGEX VIEJO
        // String regex ="^(.+,{1}.+)$";  DE LOS PIBES
        // 2 String regex = "(.*())";
        // 3 ^(.*)\s(.*)
        // 4 "^(.*\\s(.*))$";
        // 5"(.*:\d{2})(.*)"
        
        // pruebas ^(.*(.[A-Z]))
        final String regex = "^.*,(\\d{2})/(\\d{2})/(\\d{4}),.{5},([A-z]+),([A-z]+),(\\d+),(\\d+),([A-Z]{1}).*$";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        
        List<Partido> partidos = new ArrayList();
        List<EquipoPuntaje> listaEquipos = new ArrayList();
        Partido partidoAux = new Partido();
        Equipo equipoAuxVisit;
        Equipo equipoAuxLocal;
        
        try {
            archivo = new File ("S:\\PremierLeague.csv");
            
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
           
            Pattern pattern = Pattern.compile(regex);
            String linea;
            int con=0; 
            linea=br.readLine();
             System.out.println("Obteniendo una de sus lineas:\n"+linea);
             Matcher matcher = null;
           while((linea=br.readLine())!=null){
               
                matcher = pattern.matcher(linea);
                if(matcher.matches()){
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
                
                
                
                
                
                // --------------------------------------------------------------------------------------
                
                
//                 // Me fijo si ya existe el VISITANTE( USANDO equipoPuntaje en listaEquipos)


//                    Boolean existeVisit = false;
//                    Boolean existeLocal = false;
//                    for (EquipoPuntaje equipo : listaEquipos) {
//                        if(existeVisit == false){ // SI TODAVIA NO LO ENCONTRAMOS AL VISITANTE
//                             if((equipo.getEquipo().getNombre().equals(matcher.group(5)))){ // EL VISITANTE YA EXISTE
//                            equipo.setGolesAfavor(equipo.getGolesAfavor()+golesVisitante);
//                            equipo.setGolesRecibidos(golesLocal);
//                            
//                            
//                            if(matcher.group(8).equals("D")){           // EMPATADOS,PERDIDOS Y GANADOS
//                                equipo.setPartEmpatados(equipo.getPartEmpatados()+1);
//                            }else{
//                                if(matcher.group(8).equals("H")){
//                                    equipo.setPartPerdidos(equipo.getPartPerdidos()+1);
//                                }else{
//                                    if(matcher.group(8).equals("A")){
//                                    equipo.setPartPerdidos(equipo.getPartGanados()+1);
//                                }
//                                }
//                            }
//                         }
//                             existeVisit = true;
//                        }
//                        if(existeLocal == false){
//                             
//                             if((equipo.getEquipo().getNombre().equals(matcher.group(4)))){ // EL LOCAL YA EXISTE
//                            equipo.setGolesAfavor(equipo.getGolesAfavor()+golesLocal);
//                            equipo.setGolesRecibidos(golesVisitante);
//                            
//                            
//                            if(matcher.group(8).equals("D")){           // EMPATADOS,PERDIDOS Y GANADOS
//                                equipo.setPartEmpatados(equipo.getPartEmpatados()+1);
//                            }else{
//                                if(matcher.group(8).equals("A")){
//                                    equipo.setPartPerdidos(equipo.getPartPerdidos()+1);
//                                }else{
//                                    if(matcher.group(8).equals("H")){
//                                    equipo.setPartPerdidos(equipo.getPartGanados()+1);
//                                }
//                                }
//                            }
//                         }
//                            // copiar lo del otro
//                            
//                        existeLocal = true;
//                        }
//                            
//                         
//                        
//                           
//                        }
//                        if(existeVisit == false){
//                            equipoAuxVisit = new Equipo(matcher.group(5));
//                            if(matcher.group(8).equals("D")){           // EMPATADOS,PERDIDOS Y GANADOS
//                                listaEquipos.add(new EquipoPuntaje(equipoAuxVisit,golesVisitante, golesLocal,0, 0, 1));
//                            }else{
//                                if(matcher.group(8).equals("H")){
//                                    listaEquipos.add(new EquipoPuntaje(equipoAuxVisit,golesVisitante, golesLocal,0, 1, 0));
//                                }else{
//                                    if(matcher.group(8).equals("A")){
//                                    listaEquipos.add(new EquipoPuntaje(equipoAuxVisit,golesVisitante, golesLocal,1, 0, 0));
//                                }
//                                }
//                            }
//                            
//                        }
//                        if(existeLocal == false){
//                            equipoAuxLocal = new Equipo(matcher.group(4));
//                            if(matcher.group(8).equals("D")){           // EMPATADOS,PERDIDOS Y GANADOS
//                                listaEquipos.add(new EquipoPuntaje(equipoAuxLocal,golesLocal, golesVisitante,0, 0, 1));
//                            }else{
//                                if(matcher.group(8).equals("A")){
//                                    listaEquipos.add(new EquipoPuntaje(equipoAuxLocal,golesLocal, golesVisitante,1, 0, 0));
//                                }else{
//                                    if(matcher.group(8).equals("H")){
//                                    listaEquipos.add(new EquipoPuntaje(equipoAuxLocal,golesLocal, golesVisitante,0, 1, 0));
//                                }
//                                }
//                            }
//                        }
                    
                    // --------------------------------------------------------------------------------------
                    
                    // Me fijo si ya existe el VISITANTE
                    equipoAuxVisit = new Equipo(matcher.group(5));
                    for (Partido partido : partidos) {
                         if((partido.getVisitante().getNombre().equals(matcher.group(5)))){
                             equipoAuxVisit = partido.getVisitante();
                             System.out.println("El equipo visitante "+matcher.group(5)+" ya existe.");
                         }else{
                             if((partido.getLocal().getNombre().equals(matcher.group(5)))){
                                 equipoAuxVisit = partido.getLocal();
                                 System.out.println("El equipo local "+matcher.group(5)+" ya existe.");
                             }
                         }
                    }
                    
                    // Me fijo si ya existe el LOCAL
                    equipoAuxLocal = new Equipo(matcher.group(4));
                    for (Partido partido : partidos) {
                         if((partido.getVisitante().getNombre().equals(matcher.group(4)))){
                             equipoAuxLocal = partido.getVisitante();
                         }else{
                             if((partido.getLocal().getNombre().equals(matcher.group(4)))){
                                 equipoAuxLocal = partido.getLocal();
                             }
                         }
                    }
                
                if(matcher.group(8).equals("D")){
                    partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),equipoAuxLocal,equipoAuxVisit,golesLocal,golesVisitante,ResultadoEnum.D);
                }else{
                    if(matcher.group(8).equals("A")){
                        partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),equipoAuxLocal,equipoAuxVisit,golesLocal,golesVisitante,ResultadoEnum.A);
                    }else{
                        if(matcher.group(8).equals("H")){
                            partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),equipoAuxLocal,equipoAuxVisit,golesLocal,golesVisitante,ResultadoEnum.A);
                        }
                    }
                }
                partidos.add(partidoAux);
                
                
                
                
                
                }
            }
        }catch(Exception e){

        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        
        System.out.println("El ultimo partido fue:"+partidoAux);
        PartidosAdmin partidosAdmin = new PartidosAdmin(partidos);      // Recien guardo los partidos en partidosAdmin -----------------------
        System.out.println("Partidos donde jugó Liverpool: "+partidosAdmin.filtrarPorEquipo(new Equipo("Liverpool")));
        System.out.println("Listado de equipos con puntuacion \n"+listaEquipos.get(1));
}
}
