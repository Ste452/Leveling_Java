package section12_working_with_files.application;

import java.io.File;
import java.util.Scanner;

public class class_57 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter a file path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("\ngetName: " + path.getName());
		System.out.println("\ngetParent: " + path.getParent());
		System.out.println("\ngetPath: " + path.getPath());
	
		sc.close();	
	}

}
