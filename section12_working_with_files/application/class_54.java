package section12_working_with_files.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class_54 {

	public static void main(String[] args) {

		String path = "C:\\Users\\TEMP\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error = " + e.getMessage());
		}
	}
}