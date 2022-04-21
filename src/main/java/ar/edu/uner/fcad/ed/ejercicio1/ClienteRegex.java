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
        String regex = "(.*:\\d{2}).(.*)";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        
        //
        
        
        try {
            archivo = new File ("C:\\PremierLeague.csv");
            
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            //String regex = "^(.*(to|ío|ing|<b|ado)\\:?\"?>(.*)<.*)$";
//            String regex = "^(\\d+/ \\d{2}[/]\\d{4})$";
            // String regex = "^,{1}(.+,{1}\\d+),{1$";
             //regex = "^(.+,{1}.+)$";
             //regex="^(.+,{1}.+)$"
            //String regex = "^(.*(Puerto|Río|Ultimo Registro|Fecha Hora|Estado).*>(.*)<.*>(.*)<.*.*>(.*)<.*)$";
            
            //String regex = ".*data-label(.*>(\\w{1,20}\s\\..*\\.)<.*)";
            //String regex = "(.*(to:)\">(.*)<.*)";
            //String regex = "^(.*(to|ío|ng|<b|ado)\\:?\"?>(.*)</?.*)$";
            
            Pattern pattern = Pattern.compile(regex);
            String linea;
            int con=0; 

           while((linea=br.readLine())!=null){
//             System.out.println(linea);
                
                
                Matcher matcher = pattern.matcher(linea);
                if(matcher.matches()){
//                     con ++;
//                     System.out.println(con);
                  System.out.println("Matcher Grupo 1 :" + matcher.group(1));
                  System.out.println("Jugador y 18 miles de datos :" + matcher.group(2));
//                      System.out.println("Grupo PUERTO3 :      " + matcher.group(3));
//                   System.out.println("Grupo PUERTO4 :      " + matcher.group(4));
//                      System.out.println("Grupo PUERTO5 :      " + matcher.group(5));
//                      System.out.println("Grupo PUERTO6 :      " + matcher.group(6));
//                      System.out.println("Grupo PUERTO7 :      " + matcher.group(7));
//                      System.out.println("Grupo PUERTO8 :      " + matcher.group(8));
//                      System.out.println("Grupo PUERTO9 :      " + matcher.group(9));
//                   System.out.println("Grupo PUERTO10 :      " + matcher.group(10));
//                   System.out.println("Grupo PUERTO11 :      " + matcher.group(11));
//                   
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
