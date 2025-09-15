/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        LinkedList<Item> list_of_items = new LinkedList<Item>();
        
        list_of_items.add(new Item("Burger", 50));
        list_of_items.add(new Item("Fries", 20.3));
        list_of_items.add(new Item("Pizza", 120.25));
        list_of_items.add(new Item("Soda", 50.4));
        list_of_items.add(new Item("Siopao", 30.1));
    }
}
