/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 * Class for Tops
 *
 * @author sam
 */
public abstract class Tops {

//Member variables
    private String name;
    private String size;
    private String color;
    private String fabric;
    
/**
 * Tops Constructor
 * 
 * @param name
 * @param size
 * @param color
 * @param fabric 
 */
    public Tops(String name, String size, String color, String fabric) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
    }
    
/**
 * Method to set the name of the top
 * @param name 
 */
     public void setName(String name) {
        this.name = name;
    }
     
/**
 * Method to set the size of the top
 * @param size 
 */
     public void setSize(String size) {
        this.size = size;
    }
/**
 * Method to set the color of the top
 * @param color 
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * Method to set the fabric of the top
 * @param fabric 
 */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
/**
 * Method to return the size of the top
 * @return 
 */
    public String getSize() {
        return size;
    }
/**
 * Method to return the color of the top
 * @return 
 */
    public String getColor() {
        return color;
    }
/**
 * Method to return the fabric of the top
 * @return 
 */
    public String getFabric() {
        return fabric;
    }
    /**
     * Method to return the fabric of the top
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
