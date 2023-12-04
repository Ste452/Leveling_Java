package section14_Exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import section14_Exception_handling.model.entities.Reservation_class_49;

public class class_49 {


	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
<<<<<<<< HEAD:section11_Exception_handling/class_49.java
			Reservation_class_49 reservation = new Reservation_class_49(number, checkIn, checkOut);
========
			Reservation reservation = new Reservation(number, checkIn, checkOut);
>>>>>>>> e9e1883e200cf0655b51bbeebef621077a5bbd54:section14_Exception_handling/class_49.java
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
<<<<<<<< HEAD:section11_Exception_handling/class_49.java
			
========

>>>>>>>> e9e1883e200cf0655b51bbeebef621077a5bbd54:section14_Exception_handling/class_49.java
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}

		sc.close();
	}
}