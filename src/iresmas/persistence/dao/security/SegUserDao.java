/**
 * 
 */
package iresmas.persistence.dao.security;

import java.util.List;

import iresmas.persistence.dao.Dao;
import iresmas.persistence.entity.security.SegUser;

/**
 * Define los metodos a implementar para la persistencia de usuarios.
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface SegUserDao extends Dao {
	
	/**
	 * Guarada un nuevo usuario o actualiza la informacion de un usuario existente.
	 * @param user Objeto usuario con la informacion a salvar o actualizar..
	 */
	void saveUser(SegUser user);
	
	/**
	 * Borra un ususario en base a su identificador.
	 * @param idUser Identificador del usuario.
	 */
	void removeUser(Integer idUser);
	
	/**
	 * Obtiene la informacion de un usuario en base a su identificador.
	 * @param idUser Identificador del usuario.
	 * @return Informacion del usuario solicitiado.
	 */
	SegUser getUser(Integer idUser);
	
	/**
	 * Obtiene la lista de usuarios existentes.
	 * @return Lista con los usuarios.
	 */
	List<SegUser> getUsers();
	
	/**
	 * Obtiene la informacion de un usuario en base a su Nombre y password. 
	 * @param userName
	 * @param password
	 * @return
	 */
	SegUser getUserByName(String userName, String password);
	
}
