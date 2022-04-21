package ar.edu.uner.fcad.ed.ejercicio1;

/**
 *
 * @author stefa
 */
public enum ResultadoEnum {
    D("Empate"),
    A("Victoria visitante"),
    H("Victoria Local");
    
    String desc;
    private ResultadoEnum(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "ResultadoEnum{" + "desc=" + desc + '}';
    }
    
}
