/**
 * 
 */
package iresmas.persistence.entity.component.address;

import java.io.Serializable;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaCity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idCity;
	private String cityName;
	private Integer idState;
	
	public Integer getIdCity() {
		return idCity;
	}
	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getIdState() {
		return idState;
	}
	public void setIdState(Integer idState) {
		this.idState = idState;
	}

}
