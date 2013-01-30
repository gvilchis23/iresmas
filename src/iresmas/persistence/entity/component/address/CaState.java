/**
 * 
 */
package iresmas.persistence.entity.component.address;

import java.io.Serializable;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaState implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idState;
	private Integer idCountry;
	private String stateName;
	
	public Integer getIdState() {
		return idState;
	}
	public void setIdState(Integer idState) {
		this.idState = idState;
	}
	public Integer getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
