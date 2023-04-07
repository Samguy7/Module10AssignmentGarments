/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 * Class for Casual Garments
 *
 * @author sam
 */
public class CasualGarmentStore extends GarmentStore {

    //Member variables
    public String topName;
    public String pantsName;
    public String shoeName;
    public String topSize;
    public String pantsSize;
    public String shoeSize;
    public String topColor;
    public String pantsColor;
    public String shoeColor;
    public String topFabric;
    public String pantsFabric;
    public String styleShoe;

    /**
     * Constructor
     *
     * @param topName
     * @param pantsName
     * @param shoeName
     * @param topSize
     * @param pantsSize
     * @param shoeSize
     * @param size
     * @param topColor
     * @param pantsColor
     * @param shoeColor
     * @param color
     * @param topFabric
     * @param pantsFabric
     * @param fabric
     * @param styleShoe
     */
    public CasualGarmentStore(String topName, String pantsName,String shoeName, 
     String topSize, String pantsSize, String shoeSize, String topColor,
     String pantsColor, String shoeColor, String topFabric,
    String pantsFabric, String styleShoe) {
        super(topName, pantsName, shoeName, topSize, pantsSize, shoeSize, topColor,
     pantsColor, shoeColor, topFabric, pantsFabric,  styleShoe);
    }

    /**
     * Method to override tops
     *
     * @param topName
     * @param topSize
     * @param topColor
     * @param topFabric
     */
    public void Tops(String topName, String topSize, String topColor, String topFabric) {
        this.topName = topName;
        this.topSize = topSize;
        this.topColor = topColor;
        this.topFabric = topFabric;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Method to override pants
     *
     * @param pantsName
     * @param pantsSize
     * @param pantsColor
     * @param pantsFabric
     */
    public void Pants(String pantsName, String pantsSize, String pantsColor, String pantsFabric) {
        this.pantsName = pantsName;
        this.pantsSize = pantsSize;
        this.pantsColor = pantsColor;
        this.pantsFabric = pantsFabric;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Method to override shoes
     *
     * @param shoeName
     * @param shoeSize
     * @param shoeColor
     * @param styleShoe
     */
    public void Shoes(String shoeName, String shoeSize, String shoeColor, String styleShoe) {
        this.shoeName = shoeName;
        this.shoeSize = shoeSize;
        this.shoeColor = shoeColor;
        this.styleShoe = styleShoe;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "\n\nCasual Garment Attire" + "\ntopName: " + getTopName() + "\npantsName: " + getPantsName() +
        "\nshoeName: " + getShoeName() + "\ntopSize: " + getTopSize() + "\npantsSize: " + getPantsSize() + 
        "\nshoeSize: " + getShoeSize() + "\ntopColor: " +  getTopColor() + "\npantsColor: " +  getPantsColor() + 
        "\nshoeColor: " +  getShoeColor() + "\ntopFabric: " + getTopFabric() + "\npantsFabric: " + getPantsFabric() +
       "\nShoe: " +  getStyle(); 
    }

    @Override
    public void Tops(String name, int size, String color, String fabric) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Pants(String name, int size, String color, String fabric) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Shoes(String name, int size, String color, String style) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
