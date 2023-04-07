/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author sam
 */
public abstract class Pants {
    //Member variables

    private String name;
    private String size;
    private String color;
    private String fabric;

    /**
     * Pants Constructor
     *
     * @param name
     * @param size
     * @param color
     * @param fabric
     */
    public Pants(String name, String size, String color, String fabric) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.fabric = fabric;
    }

    /**
     * Method to set the name of the pants
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to set the size of the pants
     *
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Method to set the color of the pants
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Method to set the fabric of the pants
     *
     * @param fabric
     */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /**
     * Method to return the size of the pants
     *
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * Method to return the color of the pants
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Method to return the fabric of the pants
     *
     * @return
     */
    public String getFabric() {
        return fabric;
    }

    /**
     * Method to return the name of the pants
     *
     * @return
     */
    public String getName() {
        return name;
    }

}
