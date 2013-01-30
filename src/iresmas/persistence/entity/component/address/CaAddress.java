/**
 * 
 */
package iresmas.persistence.entity.component.address;

import java.io.Serializable;

/**
 * Representa un domicilio para ser usado en cualquier modulo del sistema
 * @author Cristopher Cerrillo Callejas
 *
 */
public class CaAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idAddress;
	private CaCountry country;
	private CaState state;
	private CaCity city;
	private String streetName;
	private String externalNumber;
	private String internalNumber;
	private String zipNumber;
	
	public Integer getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(Integer idAddress) {
		this.idAddress = idAddress;
	}
	public CaCountry getCountry() {
		return country;
	}
	public void setCountry(CaCountry country) {
		this.country = country;
	}
	public CaState getState() {
		return state;
	}
	public void setState(CaState state) {
		this.state = state;
	}
	public CaCity getCity() {
		return city;
	}
	public void setCity(CaCity city) {
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getExternalNumber() {
		return externalNumber;
	}
	public void setExternalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
	}
	public String getInternalNumber() {
		return internalNumber;
	}
	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}
	public String getZipNumber() {
		return zipNumber;
	}
	public void setZipNumber(String zipNumber) {
		this.zipNumber = zipNumber;
	}

}
