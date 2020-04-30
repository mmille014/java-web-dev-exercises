package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Scanner;

public class Restaurant {
    private static Menu menu = new Menu();
    private static int menuIdNum = 1;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int selection = 0;
            do{
                system.out.println();
                system.out.println("Welcome to Wantons on Wheels!");
                system.out.println("1) Print the menu");
                system.out.println("2) Print a single menu item");
                system.out.println("3) Add a menu item");
                system.out.println("4) Remove a menu item");
                system.out.println("5) Exit");
                system.out.println("Selection");

                String userInput = in.nextLine();

                selection = Integer.parseInt(userInput);

                Switch (selection) {
                    case 1:
                        System.out.println(menu.getLastUpdated());
                        for (MenuItem menuItems : menu.getMenu()) {
                            System.out.println(menuItems.toString());
                        }
                        System.out.println();
                        break;
                    Case 2:
                        System.out.println("Enter the menu ID you wish to print: ");
                        String userInToPrint = in.nextLine();

                    int menuIdToPrint = Integer.parseInt(userInToPrint);

                    for (MenuItem menuItem : menu.getMenu()) {
                        if (menuItem.getMenuId() == menuIdToPrint) {
                            System.out.println(menuItem);
                            break;
                     case 3:
                         Sy

                        }
                    }


                }
            }
        }
    }
}
