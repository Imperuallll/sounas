/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.mavenproject2;

/**
 *
 * @author User
 */
public class PhysicalProduct extends Product {
    double shippingCost;
    
    PhysicalProduct(String name, double price, int quantInStock){
        super(name, price, quantInStock);
 this.shippingCost = shippingCost;
    }
    double calculateTotalCost(int quantity) {
 return (price * quantity) + shippingCost;
 }
         
}
 