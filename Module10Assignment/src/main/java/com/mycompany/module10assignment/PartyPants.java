/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author sam
 */
public class PartyPants extends Pants {
    
    public PartyPants(String name, String size, String color, String fabric) {
        super(name, size, color, fabric);
    }
    
    @Override
    public String toString() {
        return "Party Pants" + "\nSize: " + getSize() + "\nColor: " +  getColor() + "\nFabric: " + 
                getFabric(); 
}
}
