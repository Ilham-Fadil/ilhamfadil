package ma.gov.tp8.models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Facture {
	@Id
	@GeneratedValue
	private long id;
	private Date date;
	@Transient
	private double amount;
	
	public Facture() {
		
	}
	public Facture(long id, Date date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public Facture(Date date) {
		super();
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Facture [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
}
