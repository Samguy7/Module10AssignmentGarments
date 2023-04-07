/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 * Class to create the garments
 *
 * @author sam
 */
public abstract class GarmentStore {
    
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

    // constructor that takes only two paras
    public GarmentStore(String topName, String pantsName,String shoeName, 
     String topSize, String pantsSize, String shoeSize, String topColor,
     String pantsColor, String shoeColor, String topFabric,
    String pantsFabric, String styleShoe) {
        this.topName = topName;
        this.pantsName = pantsName;
        this.shoeName = shoeName;
        this.topSize = topSize;
        this.pantsSize = pantsSize;
        this.shoeSize = shoeSize;
        this.topColor = topColor;
        this.pantsColor = pantsColor;
        this.shoeColor =  shoeColor;
        this.pantsColor = pantsColor;
        this.shoeColor =  shoeColor;
        this.topFabric = topFabric;
        this.pantsFabric = pantsFabric;
        this.styleShoe = styleShoe;
    }

    /**
     * Method to set the name of the top
     *
     * @param topName
     */
    public void settopName(String topName) {
        this.topName = topName;
    }
    /**
     * Method to set the name of the pants
     *
     * @param pantsName
     */
    public void setPantsName(String pantsName) {
        this.pantsName = pantsName;
    }
    /**
     * Method to set the name of the shoe
     *
     * @param shoeName
     */
    public void setshoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    /**
     * Method to return the name of the top
     * @return 
     */
    public String getTopName() {

        return topName;
    }
    
    /**
     * Method to return the name of the pants
     * @return 
     */
    public String getPantsName() {

        return pantsName;
    }
    
    /**
     * Method to return the name of the shoe
     * @return 
     */
    public String getShoeName() {

        return shoeName;
    }

    /**
     * Method to set the size of the top
     *
     * @param topSize
     */
    public void setTopSize(String topSize) {
        this.topSize = topSize;
    }

    /**
     * Method to set the size of the pants
     *
     * @param pantsSize
     */
    public void setPantsSize(String pantsSize) {
        this.pantsSize = pantsSize;
    }
    
    /**
     * Method to set the size of the shoe
     *
     * @param shoeSize
     */
    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }
    
    /**
     * Method to return the size of the top
     * @return 
     */
    public String getTopSize() {

        return topSize;
    }

    /**
     * Method to return the size of the pants
     * @return 
     */
    public String getPantsSize() {

        return pantsSize;
    }
    
    /**
     * Method to return the size of the shoe
     * @return 
     */
    public String getShoeSize() {

        return shoeSize;
    }
    /**
     * Method to set the color of the top
     *
     * @param topColor
     */
    public void setTopColor(String topColor) {
        this.topColor = topColor;
    }

    /**
     * Method to set the color of the pants
     *
     * @param pantsColor
     */
    public void setPantsColor(String pantsColor) {
        this.pantsColor = pantsColor;
    }
    
    /**
     * Method to set the color of the shoe
     *
     * @param shoeColor
     */
    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }
    /**
     * Method to return the color of the top
     *
     * @return
     */
    public String getTopColor() {

        return topColor;
    }
    
    /**
     * Method to return the color of the pants
     *
     * @return
     */
    public String getPantsColor() {

        return pantsColor;
    }
    
    /**
     * Method to return the color of the shoe
     *
     * @return
     */
    public String getShoeColor() {

        return shoeColor;
    }

    /**
     * Method to set the fabric of the top
     *
     * @param topFabric
     */
    public void setTopFabric(String topFabric) {
        this.topFabric= topFabric;
    }
    
    /**
     * Method to set the fabric of the pants
     *
     * @param pantsFabric
     */
    public void setPantsFabric(String pantsFabric) {
        this.pantsFabric = pantsFabric;
    }

    /**
     * Method to return the fabric of the top
     *
     * @return
     */
    public String getTopFabric() {

        return topFabric;
    }

    /**
     * Method to return the fabric of the pants
     *
     * @return
     */
    public String getPantsFabric() {

        return pantsFabric;
    }
    
    /**
     * Method to set the style of the shoe
     *
     * @param style
     */
    public void setStyle(String style) {
        this.styleShoe = styleShoe;
    }

    /**
     * Method to return the style of the shoe
     *
     * @return
     */
    public String getStyle() {
        return styleShoe;
    }

    /**
     * Method to create tops
     *
     * @param topName
     * @param size
     * @param color
     * @param fabric
     */
    public abstract void Tops(String topName, int size, String color, String fabric);

    /**
     * Method to create pants
     *
     * @param pantsName
     * @param size
     * @param color
     * @param fabric
     */
    public abstract void Pants(String pantsName, int size, String color, String fabric);

    /**
     * Method to create shoes
     *
     * @param shoeName
     * @param size
     * @param color
     * @param style
     */
    public abstract void Shoes(String shoeName, int size, String color, String style);

}
