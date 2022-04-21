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
        Partido partidoAux = new Partido();
        
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
                
                
                
                if(matcher.group(8).equals("D")){
                    partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),new Equipo(local),new Equipo(visitante),golesLocal,golesVisitante,ResultadoEnum.D);
                }else{
                    if(matcher.group(8).equals("A")){
                        partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),new Equipo(local),new Equipo(visitante),golesLocal,golesVisitante,ResultadoEnum.A);
                    }else{
                        if(matcher.group(8).equals("H")){
                            partidoAux = new Partido(LocalDate.of(anio,Month.of(mes),dia),new Equipo(local),new Equipo(visitante),golesLocal,golesVisitante,ResultadoEnum.A);
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
        PartidosAdmin partidosAdmin = new PartidosAdmin(partidos);
        System.out.println("Partidos donde jugó Liverpool: "+partidosAdmin.filtrarPorEquipo(new Equipo("Liverpool")));
        
}
}
