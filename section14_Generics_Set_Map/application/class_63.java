package section14_Generics_Set_Map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import section14_Generics_Set_Map.model.service.CalculationService;

public class class_63 {

	public static void main(String[] args) {
		
	   List<Integer> list = new ArrayList<>();
       
	   String path = "C:\\Users\\TEMP\\in.txt";
	   
	   try (BufferedReader br = new BufferedReader	(new FileReader(path))){
		   
		    String line = br.readLine();
		   
		   	while (line != null) {
		   		list.add(Integer.parseInt(line));
		   		line = br.readLine();
		   	}
		   	
		   	Integer x = CalculationService.max(list);
		   	System.out.println("Max: ");
		   	System.out.println(x);
	   } catch (IOException e) {
		   System.out.println("Error: " + e.getMessage());
	   }

	}

}