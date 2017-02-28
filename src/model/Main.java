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
		
		System.out.println("Witaj w agencj nieruchomości");
		System.out.println("1 - lista nieruchomości, 2 - dodaj nieruchomość");
		
		Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
		String choice = scanner.nextLine();
		scanner.close();
		
		if (choice.equals("2")) {
			System.out.println("Czyli chcesz dodać nową nieruchomość...");
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
		
		System.out.println("Podaj typ nieruchomości: ");
		Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
		String type = scanner.next();
		
		
		System.out.println("Podaj adres nieruchomości: ");
		String address = scanner.nextLine();
		
		System.out.println("Podaj powierzchnię: ");
		Double area = scanner.nextDouble();
		
		scanner.close();
		
		p = new Property(type, address, area);
		
		return p;
		
	}

}
