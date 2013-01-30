/**
 * 
 */
package iresmas.persistence.entity;

import iresmas.persistence.entity.component.address.CaAddress;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Cristopher Cerrillo Callejas
 *
 */
public class ComEmployee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idEmployee;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private String rfc;
	private String nss;
	private String curp;
	private String personalPhoneNumber;
	private String personalEmail;
	private String celNumber;
	private int sex;
	private CaAddress address;
	private Date entryDate;
	private String employeeEmail;
	private ComEmployee supervisor;
	
	private int idArea;///POR DEFINIR

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getPersonalPhoneNumber() {
		return personalPhoneNumber;
	}

	public void setPersonalPhoneNumber(String personalPhoneNumber) {
		this.personalPhoneNumber = personalPhoneNumber;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getCelNumber() {
		return celNumber;
	}

	public void setCelNumber(String celNumber) {
		this.celNumber = celNumber;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public CaAddress getAddress() {
		return address;
	}

	public void setAddress(CaAddress address) {
		this.address = address;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public ComEmployee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(ComEmployee supervisor) {
		this.supervisor = supervisor;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}
	
	
	
	
}
