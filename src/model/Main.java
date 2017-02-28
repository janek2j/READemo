package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private Property property;
	private ArrayList<Property> properties; 
	
	public Main() {
		property = new Property();
		properties = new ArrayList<Property>();
		
		properties.add(property);
		
		System.out.println("Witaj w agencj nieruchomoœci");
		System.out.println("1 - lista nieruchomoœci, 2 - dodaj nieruchomoœæ");
		
		Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		String choice = scanner.nextLine();
		scanner.close();
		
		if (choice.equals("2")) {
			System.out.println("Czyli chcesz dodaæ now¹ nieruchomoœæ...");
		}
		
		readDataForNewProperty();
		
		System.out.println(property.getAddress());
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	String readFromConsole() {
		return null;
		
	}
	
	public Property readDataForNewProperty() {
		
		Property p;
		
		System.out.println("Podaj typ nieruchomoœci: ");
		Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		String type = scanner.next();
		
		
		System.out.println("Podaj adres nieruchomoœci: ");
		String address = scanner.nextLine();
		
		System.out.println("Podaj powierzchniê: ");
		Double area = scanner.nextDouble();
		
		scanner.close();
		
		p = new Property(type, address, area);
		
		return p;
		
	}

}
