/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author sam
 */
public class ProfessionalShoes extends Shoes {

    public ProfessionalShoes(String name, String size, String color, String style) {
        super(name, size, color, style);
    }

    @Override
    public String toString() {
        return "Professional Shoes" + "\nName: " + getName() + "\nSize: " + getSize() + "\nColor: " + getColor() + "\nFabric: "
                + getStyle();
    }
}
