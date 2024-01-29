package section12_working_with_files.application.exercise_mod12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section12_working_with_files.application.exercise_mod12.entities.Product;

public class exercise_mod12 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        System.out.println("Enter file path: ");

        try (Scanner sc = new Scanner(System.in)) {
            String sourceFileStr = sc.nextLine();
            File sourceFile = new File(sourceFileStr);
            String sourceFolderStr = sourceFile.getParent();

            boolean success = new File(sourceFolderStr + File.separator + "out").mkdir();
            String targetFileStr = sourceFolderStr + File.separator + "out" + File.separator + "summary.csv";

            List<Product> list = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

                String itemCsv = br.readLine();
                while (itemCsv != null) {

                    String[] fields = itemCsv.split(",");
                    if (fields.length == 3) {
                        String name = fields[0];
                        double price = Double.parseDouble(fields[1]);
                        int quantity = Integer.parseInt(fields[2]);

                        list.add(new Product(name, price, quantity));
                    } else {
                        System.out.println("Invalid line in CSV file: " + itemCsv);
                    }

                    itemCsv = br.readLine();
                }

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                    for (Product item : list) {
                        bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                        bw.newLine();
                    }

                    System.out.println(targetFileStr + " CREATED!");

                } catch (IOException e) {
                    System.out.println("Error writing file: " + e.getMessage());
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}