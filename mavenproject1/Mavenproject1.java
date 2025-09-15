/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Item> list_of_items = new LinkedList<Item>();
        LinkedList<Item> cart = new LinkedList<Item>();

        list_of_items.add(new Item(1, "Burger", 50));
        list_of_items.add(new Item(2, "Fries", 20.3));
        list_of_items.add(new Item(3, "Pizza", 120.25));
        list_of_items.add(new Item(4, "Soda", 50.4));
        list_of_items.add(new Item(5, "Siopao", 30.1));
        
        int input;
        double TotPrice = 0;
        double change = 0;
        
       while(true){
        System.out.print("Enter option: ");
        input = scan.nextInt();
        
        if(input == -1){
            System.out.println("Thank you!");
            break;
        }
        
        
        for(Item i : list_of_items){
            if(i.item_id == input){
                System.out.println("Added: " + i.getName());
                cart.add(i);
                TotPrice += i.getPrice();
                break;
            }
            
        }
        
       }
        System.out.println("Total:" + TotPrice);
//        System.out.print("Input Money: ");
//        change = scan.nextDouble();
//        
//        change -= TotPrice;
//        System.out.printf("Change: %.2f\n", change);
        
        while(change < TotPrice){
            System.out.print("Input: ");
            change = scan.nextDouble();
            
            if(change < TotPrice){
                System.out.print("Insufficient, again!\n");
            }
        }
        
        change -= TotPrice;
        System.out.printf("Change: %.2f\n", change);
        
        System.out.println("====Receipt====");
        System.out.println("Items:");
        for(Item i : cart){
            System.out.println(i.getName() + " " + "Php" + i.getPrice());
        }
        System.out.println("Total: " + TotPrice);
        System.out.println("Received: " + change);
        System.out.println("Change:" + (change - TotPrice));
        System.out.println("Thank you");
        
        
//        if(TotPrice > change){
//            System.out.print("Insufficient Money");
//        }
    }
}
