package ar.edu.uner.fcad.ed.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        String regex = "^.*,(\\d{2})/(\\d{2})/(\\d{4}),.{5},([A-z]+),([A-z]+),(\\d{1}),(\\d{1}),([A-Z]{1}).*$";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        
        
        try {
            archivo = new File ("S:\\PremierLeague.csv");
            
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
           
            Pattern pattern = Pattern.compile(regex);
            String linea;
            int con=0; 
            linea=br.readLine();
             System.out.println("Obteniendo una de sus lineas:\n"+linea);
           while((linea=br.readLine())!=null){
                
                Matcher matcher = pattern.matcher(linea);
                if(matcher.matches()){
                System.out.println("***************");
                System.out.println("Matcheo primer grupo(dia): "+matcher.group(1));
                System.out.println("Matcheo segundo grupo(mes): "+matcher.group(2));
                System.out.println("Matcheo tercer grupo(anio): "+matcher.group(3));
                System.out.println("Matcheo cuarto grupo(HomeTeam): "+matcher.group(4));
                System.out.println("Matcheo quinto grupo(AwayTeam): "+matcher.group(5));
                System.out.println("Matcheo sexto grupo(FTHG): "+matcher.group(6));
                System.out.println("Matcheo septimo grupo(FTAG): "+matcher.group(7));
                System.out.println("Matcheo octavo grupo(FTR): "+matcher.group(8));
                   
                
                // Creacion de objetos ------------------
                
                
                
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
        
    
        
}
}
