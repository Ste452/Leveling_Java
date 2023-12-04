package exercise_module5_Introduction_to_object_oriented_programming.entities;

public class Salary_problem {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double Tax() {
		return grossSalary -= tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
}
