package co.com.test.exceptions;

public class LaAplicacionNoEsLaSeleccionadaException extends AssertionError {

    public static final String LA_APLICACION_NO_ES_LA_BUSCADA = "La aplicación seleccionada ";

    public LaAplicacionNoEsLaSeleccionadaException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }

}
