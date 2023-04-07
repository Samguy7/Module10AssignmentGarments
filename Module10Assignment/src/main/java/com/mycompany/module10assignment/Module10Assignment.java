/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module10assignment;

/**
 *
 * @author sam
 */
public class Module10Assignment {

    public static void main(String[] args) {
       ProfessionalGarmentStore clothing1 = new ProfessionalGarmentStore("Shirt","Khakis", "Dress Shoe", "L","M","10","White","Beige",
        "White","Cotton","Wool","Shane");
       
       CasualGarmentStore clothing2 = new CasualGarmentStore(" T-Shirt","Jeans", "Superstar", "M","L","9","Red","Blue",
        "White/Black","Wool","Denim","Adidas");
       
       PartyGarmentStore clothing3 = new PartyGarmentStore("Blouse","Palazzo", "Sandals", "S","S","8","Black","Black",
        "White","Cotton","Wool","VanessaCrystal");
       
       System.out.print(clothing1);
       System.out.print(clothing2);
       System.out.print(clothing3);

    }
}
