package com.example.ecommerce.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;
    
    @Column(name="firstName")
    private String firstName;
    
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="address")
    private String address;
    
    @Column(name="shippingaddress")
    private String shippingaddress;
    
    @Column(name="email")
    private String email;
    
    @Column(name="telephone")
    private String telephone;

/*  protected Customer() {} */
    
    public Customer(){}
    
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', address='%s', shippingaddress='%s', email='%s', telephone='%s']",
                id, firstName, lastName, address, shippingaddress, email, telephone);
    }

	public Customer(String firstName, String lastName, String address,
		String shippingaddress, String email, String telephone) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.shippingaddress = shippingaddress;
	this.email = email;
	this.telephone = telephone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
