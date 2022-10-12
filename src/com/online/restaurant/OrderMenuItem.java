package com.online.restaurant;

public class OrderMenuItem {
    private String Menuitem;
    private int quantity;
    private double price;

    public String getMenuitem() {
        return Menuitem;
    }

    public void setMenuitem(String menuitem) {
        Menuitem = menuitem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
