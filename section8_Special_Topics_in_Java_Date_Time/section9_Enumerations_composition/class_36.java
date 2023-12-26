package section12_Enumerations_composition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import section12_Enumerations_composition.entities.Department;
import section12_Enumerations_composition.entities.HourContract;
import section12_Enumerations_composition.entities.Worker;
import section12_Enumerations_composition.entities.enums.WorkerLevel;

public class class_36 {

    public static void main(String[] args) throws ParseException {

//	Order_36 order = new Order_36(1080, new Date(), OrderStatus_36.PENDING_PAYMENT);
//	System.out.println(order);
//	OrderStatus_36 os1 = OrderStatus_36.DElIVERED;
//	OrderStatus_36 os2 = OrderStatus_36.valueOf("Delivered");
//	System.out.println(os1);
//	System.out.println(os2);

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	System.out.print("Enter department's name: ");
	String departmentName = sc.nextLine();
	System.out.println("Enter worker data:");
	System.out.print("Name: ");
	String workerName = sc.nextLine();
	System.out.print("Level: ");
	String workerLevel = sc.nextLine();
	System.out.print("Base salary: ");
	double baseSalary = sc.nextDouble();
	Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
		new Department(departmentName));

	System.out.print("How many contracts to this worker? ");
	int n = sc.nextInt();

	for (int i = 1; i <= n; i++) {
	    System.out.println("Enter contract #" + i + " data:");
	    System.out.print("Date (DD/MM/YYYY): ");
	    Date contractDate = sdf.parse(sc.next());
	    System.out.print("Value per hour: ");
	    double valuePerHour = sc.nextDouble();
	    System.out.print("Duration (hours): ");
	    int hours = sc.nextInt();
	    HourContract contract = new HourContract(contractDate, valuePerHour, hours);
	    worker.addContract(contract);
	}

	System.out.println();
	System.out.print("Enter month and year to calculate income (MM/YYYY): ");
	String monthAndYear = sc.next();
	int month = Integer.parseInt(monthAndYear.substring(0, 2));
	int year = Integer.parseInt(monthAndYear.substring(3));
	System.out.println("Name: " + worker.getName());
	System.out.println("Department: " + worker.getDepartment().getName());
	System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

	sc.close();
    }
}
