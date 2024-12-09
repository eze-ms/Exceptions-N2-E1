//! Excepción personalizada para manejar errores de formato en la entrada de datos.
public class FormatInvalidException extends RuntimeException {
    //Constructor que recibe un mensaje personalizado.
    public FormatInvalidException(String message) {
        super(message);
    }
}
