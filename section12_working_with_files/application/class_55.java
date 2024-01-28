package section12_working_with_files.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class class_55 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good evening" };

		String path = "C:\\Users\\TEMP\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}