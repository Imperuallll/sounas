/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.mavenproject2;

/**
 *
 * @author User
 */
public class DigitalProduct extends Product {
    DigitalProduct(String name, double price, int quantityInStock) {
 super(name, price, quantityInStock);
 }
     double calculateTotalCost(int quantity) {
     return price * quantity;
 }
}

    

