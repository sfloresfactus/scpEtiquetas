package scpetiquetas;

/**
 *
 * @author Sergio Flores A.
 */
public class Funciones {

    public static String fechaSql2Esp(String fecha) {

        // transforma string desde
        // 2011-12-31 00:00:00.0
        // a
        // 31/12/2011
        String separador = "/";
        return fecha.substring(8, 10) + separador + fecha.substring(5, 7)
                + separador + fecha.substring(0, 4);

    }
}
