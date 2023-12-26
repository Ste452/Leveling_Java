package section12_Enumerations_composition.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import section12_Enumerations_composition.entities.enums.OrderStatus_38;

public class Order_38 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus_38 status;

    private Client client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order_38() {
    }

    public Order_38(Date moment, OrderStatus_38 status, Client client) {
	super();
	this.moment = moment;
	this.status = status;
	this.client = client;
    }

	public Date getMoment() {
	return moment;
    }

    public void setMoment(Date moment) {
	this.moment = moment;
    }

    public OrderStatus_38 getStatus() {
	return status;
    }

    public void setStatus(OrderStatus_38 status) {
	this.status = status;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    public void addItem(OrderItem item) {
	items.add(item);
    }

    public void removeItem(OrderItem item) {
	items.remove(item);
    }

    public double total() {
	double sum = 0.0;
	for (OrderItem it : items) {
	    sum += it.subTotal();
	}
	return sum;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Order moment: ");
	sb.append(sdf.format(moment) + "\n");
	sb.append("Order status: ");
	sb.append(status + "\n");
	sb.append("Client: ");
	sb.append(client + "\n");
	sb.append("Order items:\n");
	for (OrderItem item : items) {
	    sb.append(item + "\n");
	}
	sb.append("Total price: $");
	sb.append(String.format("%.2f", total()));
	return sb.toString();
    }
}