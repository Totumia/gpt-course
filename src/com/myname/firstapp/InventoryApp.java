package com.myname.firstapp;

public class InventoryApp {
  public static void main(String[] args) {
    String itemName = "Pen";
    int itemCount = 5;
    System.out.println("Item: "+ itemName+", Quantity: "+ itemCount );
    itemCount +=10;
    System.out.println("Updated quantity for "+ itemName+" is "+ itemCount );
  }
}
