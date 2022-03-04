package ma.rest.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String name) {
		super();
		this.name = name;
	}

	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Clients [id=" + id + ", name=" + name + "]";
	}
	
	
}
