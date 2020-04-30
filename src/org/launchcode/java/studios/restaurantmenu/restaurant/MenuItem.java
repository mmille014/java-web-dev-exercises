package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.Scanner;

public class MenuItem {
    private int menuID;
    private  String description;
    private double price;
    private String category;
    private Boolean isNew;

    public MenuItem(int menuId, String description, double price, String category, Boolean isNew) {
        this.menuID = menuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Overloaded constructor for old items
    public MenuItem(int menuId, String description, double price, String category) {
        this(menuId, description, price, category, isNew: false);
    }
}
    public void setMenuId(int menuId) {this.menuId = menuId;}

    public void setDescription(String description) {this.description = description;}

    public void setPrice(double price) {this.price = price;}

    public void setCategory(String category) {this.category = category;}

    public void setIsNew(Boolean isNew) {this.isNew = isNew;}

    public int getMenuId() {return menuId;}

    public String getDescription() {return description;}

    public double getPrice() {return price;}

    public String getCategory() {return category;}

    public Boolean getIsNew() {return isNew;}

    @Override
public String toString() {
    return menuID + " " + description + " " + price + " " + category + " " + (isNew ? "*NEW" : "Customer Favorite!");
    }

    @Override
    public Boolean equals(Object f) {
    if (f == this) {
        return true;
    }
    if (f == null) {
        return false;
    }
    MenuItem menuItem = (MenuItem) f;

    return this.getCategory() == menuItem.getCategory() && this.getDescription() == menuItem.getDescription() && this,getMenuId() == menuItem.getMenuId() && this.getPrice() == menuItem.getPrice();
    }