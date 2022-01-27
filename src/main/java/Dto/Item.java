package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {

	@Id
	private int id;
	private String name;
	private double cost;
	private int Qty;
	@OneToOne(mappedBy = "item")
	private invoice invoice;

	public invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(invoice invoice) {
		this.invoice = invoice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

}
