/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author sam
 */
public abstract class Shoes {
    //Member variables
    private String name;
    private String size;
    private String color;
    private String style;
    
/**
 * Shoes Constructor
 * 
 * @param size
 * @param color
 * @param style 
 */
    public Shoes(String name, String size, String color, String style) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.style = style;
    }
    /**
     * Method to set the name of the shoes
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
/**
 * Method to set the size of the shoe
 * @param size 
 */
     public void setSize(String size) {
        this.size = size;
    }
/**
 * Method to set the color of the shoe
 * @param color 
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * Method to set the fabric of the shoe
 * @param style 
 */
    public void setStyle(String style) {
        this.style = style;
    }
/**
 * Method to return the size of the shoe
 * @return 
 */
    public String getSize() {
        return size;
    }
/**
 * Method to return the color of the shoe
 * @return 
 */
    public String getColor() {
        return color;
    }
/**
 * Method to return the fabric of the shoe
 * @return 
 */
    public String getStyle() {
        return style;
    }
    /**
     * Method to return the name of the shoe
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
