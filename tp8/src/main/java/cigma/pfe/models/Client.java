package cigma.pfe.models;

import javax.persistence.*;

@Entity

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

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

	public Client(long id,String name){
        this.id=id;
        this.name=name;
    }

    public Client(){}

    public Client(String name){
        this.name=name;
    }
}