/**
 * 
 */
package iresmas.bussiness.service.definition.security;

import java.util.List;

import iresmas.bussiness.service.definition.Service;
import iresmas.bussiness.service.exception.UserExistException;
import iresmas.persistence.dao.security.SegUserDao;
import iresmas.persistence.entity.security.SegUser;

/**
 * Define los metodos a implementar por el servicio 
 * de usuarios.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegUserService extends Service {
	
	/**
	 * Establece la instancia del dao solicitado.
	 * @param userDao Instancia solicitada paar poder 
	 * acceder a la capa de persistencia.
	 */
	void setUserDao(SegUserDao userDao);
	
	/**
	 * Guarda un usuario o actuliza su informacion.
	 * @param user Usuario a salvar o actualizar.
	 * @throws UserExistException En caso de que el usuario exista.
	 */
	void saveUser(SegUser user)throws UserExistException;
	
	/**
	 * Borra un usuario en base a su identificador.
	 * @param idUser Identificador del usuario.
	 */
	void removeUser(Integer idUser);
	
	/**
	 * Obtiene un usuario en especifico en base a su identificador.
	 * @param idUser Identofocador del usuario.
	 * @return Usuario solicitado.
	 */
	SegUser getUser(Integer idUser);
	
	/**
	 * Obtiene la lista de usuarios. 
	 * @return Lista con llena con los usuarios.
	 */
	List<SegUser> getUsers();
	
	/**
	 * Este metodo valida y otorga el acceso del usuario.
	 * @param userName Nombre del usuario.
	 * @param password Contraseña de los usuarios
	 * @return Cadena de validacion de acceso.
	 */
	String loginService(String userName, String password);

}
