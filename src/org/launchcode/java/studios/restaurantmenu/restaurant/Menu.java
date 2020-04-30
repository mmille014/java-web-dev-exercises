package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//**Menu Class*****

public class Menu {

    private List<MenuItem> menu;
    private LocalDateTime lastUpdated;

    //Constructor for Menu
    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }
    //Methods
    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    public void removeMenuItem(int menuItemId) {
        //We can iterate through the menu here using a method to determine what to remove
    }


    //Return the entire menu of menuItems
    public List<MenuItem> getMenu() {return menu;}

    //Last time menu was updated method/utility
    public LocalDateTime getLastUpdated() {return lastUpdated;}

}
