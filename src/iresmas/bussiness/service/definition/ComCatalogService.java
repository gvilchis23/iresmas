/**
 * 
 */
package iresmas.bussiness.service.definition;

import java.util.List;

import iresmas.persistence.dao.ComCatalogDao;
import iresmas.persistence.entity.ComCatalog;

/**
 * Define los metodos que deben ser implementados
 * por el servicio de catalogos.
 * @author Cristopher Cerrillo Callejas
 * @version 1.0
 */
public interface ComCatalogService extends Service {
	
	/**
	 * Establece la instancia del dao especifico
	 * para poder acceder a la capa de persistencia.
	 * @param catalogDao Parametro mediante el cual
	 * se obtiene la instancia del dao solicitado.
	 */
	void setComCatalogDao(ComCatalogDao catalogDao);
	
	/**
	 * Guarda o actualiza un la informacion de un registro 
	 * del catalogo común.
	 * @param comCatalog Contiene la informacion del catalogo.
	 */
	void saveCatalog(ComCatalog comCatalog);
	
	/**
	 * Realiza el borrado de un registro en el catalogo comun.
	 * @param idComCatalog Identificador del registro a borrar.
	 */
	void removeCatalog(Integer idComCatalog);
	
	/**
	 * Obtiene un lista con la informacion de los registros 
	 * existentes en el catalogo comun.
	 * @return Lista con el resultado.
	 */
	List<ComCatalog> getCatalogs();
	
	/**
	 * Obtiene la lista de catalogos en base el padre.
	 * @param catalogFather Identifica al catalogo padre.
	 * @return Lista de catlogos hijos.
	 */
	List<ComCatalog> getCatalogChildrens(ComCatalog catalogFather);
	
	/**
	 * Obtiene el detalle de un catalogo en especifico.
	 * @param idComCatalog Identificador del catalogo.
	 * @return Instancia de catalogo con la informacion completa.
	 */
	ComCatalog getCatalog(Integer idComCatalog);

}
