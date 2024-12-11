/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.mavenproject2;

/**
 *
 * @author User
 */
public class Product {
    String name;
    double price;
    int quantInStock;

    public Product(String name, double price, int quantInStock) {
        this.name = name;
        this.price = price;
        this.quantInStock = quantInStock;
    }
    

    public void displayInfo(){
        System.out.println("name is "+ " "+ name);
        System.out.println("price is "+ " "+ price);
        System.out.println("quantity is "+ " "+ quantInStock);
    } 
    
}
