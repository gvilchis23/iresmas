/**
 * 
 */
package iresmas.persistence.dao;

import java.util.List;

import iresmas.persistence.entity.ComCatalog;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public interface ComCatalogDao extends Dao {
	
	/**
	 * Guarda un registro en el catalogo comun.
	 * @param comCatalog Contiene la informacion del catalogo.
	 */
	void saveCatalog(ComCatalog comCatalog);
	
	/**
	 * Borra un registro del catalogo comun.
	 * @param idComCatalog Indica el registro especifico a remover.
	 */
	void removeCatalog(Integer idComCatalog);
	
	/**
	 * Obtiene la lisat de catlogos padres e hijos.
	 * @return Lista con el resultado.
	 */
	List<ComCatalog> getCatalogs();
	
	/**
	 * Obtiene al lista de catalogos en base el padre.
	 * @param catalogFather Identifica al catalog padre.
	 * @return Lista de catlogos hijos.
	 */
	List<ComCatalog> getCatalogChildrens(ComCatalog catalogFather);
	
	/**
	 * Obtiene el detalle de un catalogo.
	 * @param idComCatalog Identificador dle catalogo
	 * @return Informacion completa del catlogo.
	 */
	ComCatalog getCatalog(Integer idComCatalog);

}
