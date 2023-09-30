package controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import model.EastAsiaCountryModel;
import view.EastAsiaCountryView;

public class EastAsiaCountryController {

    private EastAsiaCountryModel[] countries;
    private EastAsiaCountryView view;

    public EastAsiaCountryController() {
        countries = new EastAsiaCountryModel[11];
        view = new EastAsiaCountryView();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputCountriesInfo();
                    break;
                case 2:
                    displayCountriesInfo();
                    break;
                case 3:
                    searchCountryByName();
                    break;
                case 4:
                    displaySortedByName();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void inputCountriesInfo() {
        for (int i = 0; i < 11; i++) {
            view.displayMenu();
            System.out.println("Enter information for Country " + (i + 1) + ":");
            countries[i] = view.inputCountryInfo();
        }
    }

    private void displayCountriesInfo() {
        for (EastAsiaCountryModel country : countries) {
            if (country != null) {
                view.displayCountryInfo(country);
            }
        }
    }

    private void searchCountryByName() {
        view.displayMenu();
        String searchName = view.askForCountryName();
        boolean found = false;

        for (EastAsiaCountryModel country : countries) {
            if (country != null && country.getCountryName().equalsIgnoreCase(searchName)) {
                view.displayCountryInfo(country);
                found = true;
                break;
            }
        }

        if (!found) {
            view.displayCountryNotFound();
        }
    }

    private void displaySortedByName() {
        // Sort countries by name
        Arrays.sort(countries, Comparator.comparing(EastAsiaCountryModel::getCountryName));

        System.out.println("Countries sorted by name:");
        for (EastAsiaCountryModel country : countries) {
            if (country != null) {
                view.displayCountryInfo(country);
            }
        }
    }
}
