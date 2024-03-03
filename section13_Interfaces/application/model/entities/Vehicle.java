package section13_Interfaces.application.model.entities;

public class Vehicle {
	
	public String model;
	
	public Vehicle() {}

	public Vehicle(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}