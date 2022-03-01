package com.cigma.demo.Models;

import javax.persistence.*;

@Entity
@IdClass(CompanyId.class)

public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long idC;
	//private String name;
	//private String address;
	//@Embedded
	//@AttributeOverride(name = "phone", column = @Column(name ="PHONE_PERSON"))
	//private ContactPerson contactPerson;

//		@Id
//		private long rc;
//		@Id
//		private long idTribunal;

	//@EmbeddedId
//	private CompanyId id;
	private String name;
	private String address;
	private String phone;
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name = "PHONE_PERSON"))
	private ContactPerson contactPerson;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ContactPerson getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Company(String name, String address, String phone, ContactPerson contactPerson) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.contactPerson = contactPerson;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

}
