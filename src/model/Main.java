package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private Property property;
	private ArrayList<Property> properties; 
	
	public Main() throws FileNotFoundException {
		property = new Property();
		properties = new ArrayList<Property>();
		
		properties.add(property);
		boolean done = false;
		
		do {		
			System.out.println("Witaj w agencji nieruchomo�ci");
			System.out.println("1 - lista nieruchomo�ci, 2 - dodaj nieruchomo��, 3 - odczytaj dane z pliku");
			System.out.println("q - wyj�cie z programu");
			
			Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
			String choice = scanner.nextLine();	
			
			if (choice.equals("q")) {
				System.out.println("Zako�czenie programu...");
				continue;
			}				
			else {			
				switch(Integer.parseInt(choice)) {
				case 2:
					System.out.println("Czyli chcesz doda� now� nieruchomo��...");
					property = readDataForNewProperty();
					break;
				case 3:
					System.out.println("Wczytuj� dane z pliku dane.txt");	
					property = readPropertyFromFile();
					break;
				default: 
					break;
				}	
			}
		} while (!done);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new Main();
	}
	
	String readFromConsole() {
		return null;		
	}
	
	public Property readPropertyFromFile() throws FileNotFoundException {
		Property p;		
		
		File file = new File("dane.txt");
		Scanner in = new Scanner(file);
		String str = in.nextLine();
		System.out.println("Pobra�em " + str);	
		
		String[] tokens = str.split("\\|");
		String typ = tokens[0];
		String adres = tokens[1];
		Double powierzchnia = Double.parseDouble(tokens[2]);
		in.close();
		
		p = new Property(typ, adres, powierzchnia);
		
		System.out.println("Wczyta�em z pliku: " + p.toString());
		return p;
		
	}
	
	public Property readDataForNewProperty() {
		
		Property p;
		
		System.out.println("Podaj typ nieruchomo�ci: ");
		Scanner scanner = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		String type = scanner.nextLine();		
		
		//scanner.reset();
		System.out.println("Podaj adres nieruchomo�ci: ");
		String address = scanner.nextLine();
		
		System.out.println("Podaj powierzchni�: ");
		Double area = scanner.nextDouble();
		scanner.close();
		
		p = new Property(type, address, area);
		
		return p;		
	}

}
