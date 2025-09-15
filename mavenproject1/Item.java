/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Item {
    public int item_id;
    private String name;
    private double price;
    
    public Item(int item_id, String name, double price){
        this.item_id = item_id;
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return this.price;
    }
}