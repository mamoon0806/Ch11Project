package edu.seminolestate.manageparts;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ManageParts {
	public static void displayMain() {
		System.out.println("1. Create Purchased Part\n" + 
				"2. Create Manufactured Part\n" + 
				"3. List a part\n" + 
				"4. List all parts\n" + 
				"5. Exit");
	}
	public static void main(String[] args) {
		ArrayList<Part> parts = new ArrayList<Part>();
		
		displayMain();
		while(true) {
			Scanner sc = new Scanner(System.in); 
			int input = sc.nextInt();
			if(input == 1) {
				System.out.println("Enter the ID");
				int id = sc.nextInt(); 
				for(int i = 0; i < parts.size(); i++) {
					if(parts.get(i).getPartID() == id) {
						System.out.println("ID taken. Enter new ID");
						id = sc.nextInt(); 
					}
				}
				System.out.println("Enter the Description");
				String description = sc.nextLine(); 
				description = sc.nextLine();
				System.out.println("Enter the Sell Price");
				double sellPrice = sc.nextDouble(); 
				System.out.println("Enter the Purchase price");
				double purchasePrice = sc.nextDouble(); 
				System.out.println("Enter the Vendor");
				String vendor = sc.nextLine(); 
				vendor = sc.nextLine(); 
				System.out.println("Enter the Handling Cost");
				double handlingCost = sc.nextDouble(); 
				PurchasedPart part = new PurchasedPart(id, description, sellPrice, handlingCost, purchasePrice, vendor);
				parts.add(part);
				displayMain();
			}
			
			if(input == 2) {
				System.out.println("Enter the ID");
				int id = sc.nextInt(); 
				for(int i = 0; i < parts.size(); i++) {
					if(parts.get(i).getPartID() == id) {
						System.out.println("ID taken. Enter new ID");
						id = sc.nextInt(); 
					}
				}
				System.out.println("Enter the Description");
				String description = sc.nextLine(); 
				description = sc.nextLine(); 
				System.out.println("Enter the Sell Price");
				double sellPrice = sc.nextDouble(); 
				System.out.println("Enter the Labor cost");
				double laborCost = sc.nextDouble(); 
				System.out.println("Enter the Material Cost");
				double materialCost = sc.nextDouble(); 
				ManufacturedPart part = new ManufacturedPart(id, description, sellPrice, laborCost, materialCost);
				parts.add(part);
				displayMain();
			}
			
			if(input == 3) {
				System.out.println("Enter the Part ID");
				int id = sc.nextInt();
				if(parts.size() == 0) {
					System.out.println("Parts list is empty");
				}
				else {	
					for(int i = 0; i < parts.size(); i++) {
						if(i == parts.size() - 1 && parts.get(i).getPartID() != id) {
							System.out.println("Part not found");
						}
						if(parts.get(i).getPartID() == id) {
							System.out.println(parts.get(i).toString());
							System.out.println("Total Cost: " + parts.get(i).getTotalCost());
							
						}
					}
				}
				displayMain();
			}
			
			if(input == 4) {
				if(parts.size() == 0) {
					System.out.println("Parts list is empty");
				}
				for(Part part : parts) {
					System.out.println(part.toString());
					System.out.println("Total Cost: " + part.getTotalCost());
				}
				displayMain();
			}
			if(input == 5) {
				System.out.println("Thanks for using parts manager!");
				System.exit(0);
			}
		}
	}
}
