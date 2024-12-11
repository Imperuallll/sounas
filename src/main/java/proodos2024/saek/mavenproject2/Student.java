/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.mavenproject2;

/**
 *
 * @author User
 */
public class Student extends Person {
    String studentId;
    void displayStudentsDetails(){
        displayDetails();
        System.out.println("id is"+ " " +studentId);
    }
    
}
