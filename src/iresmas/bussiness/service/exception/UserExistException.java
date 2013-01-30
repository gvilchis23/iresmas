/**
 * 
 */
package iresmas.bussiness.service.exception;

/**
 * Clase de excepcion cuando existe un usuario.
 * @author Cristopher Cerrillo Callejas
 * @version 1.0
 * 
 */
public class UserExistException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
     * Constructor para UserExistsException.
     * @param message Mensaje a enviar a consola.
     */
    public UserExistException(String message) {
        super(message);
    }
}
