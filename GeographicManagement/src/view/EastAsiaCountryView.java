package view;

import java.util.Scanner;
import model.EastAsiaCountryModel;

public class EastAsiaCountryView {

    public void displayMenu() {
        System.out.println("1. Enter information for 11 countries in East Asia");
        System.out.println("2. Display information of countries you've just input");
        System.out.println("3. Search for a country by name");
        System.out.println("4. Display information sorted by country name");
        System.out.println("5. Exit");
    }

    public EastAsiaCountryModel inputCountryInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Country Code: ");
        String code = scanner.nextLine();
        System.out.print("Country Name: ");
        String name = scanner.nextLine();
        float area = -1;
        do {
            System.out.print("Total Area (greater than 0): ");
            area = scanner.nextFloat();
        } while (area <= 0);

        scanner.nextLine(); 
        System.out.print("Country Terrain: ");
        String terrain = scanner.nextLine();

        return new EastAsiaCountryModel(code, name, area, terrain);
    }

    public void displayCountryInfo(EastAsiaCountryModel country) {
        System.out.println("Country Information:");
        System.out.println("Country Code: " + country.getCountryCode());
        System.out.println("Country Name: " + country.getCountryName());
        System.out.println("Total Area: " + country.getTotalArea());
        System.out.println("Country Terrain: " + country.getCountryTerrain());
        System.out.println("-------------------");
    }

    public String askForCountryName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the country name to search: ");
        return scanner.nextLine();
    }

    public void displayCountryNotFound() {
        System.out.println("Country not found.");
    }
}
