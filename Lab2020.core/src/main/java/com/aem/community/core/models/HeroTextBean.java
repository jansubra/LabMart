package com.aem.community.core.models;
/**
 * The Class HeroTextBean.
 */
public class HeroTextBean {
        
    /** The heading text. */
    private String headingText;        
    /** The description. */
    private String description;     
    /** Stores Path information */
    private String path ;      
    /** Stores Date information */
    private String startDate ;         
    /** Stores Checkbox information */
    private String show ;         
    /** Stores Select  information */
    private String con;    
    /** Stores Select  information */
    private String fru;
    /** Stores Colour  information */
    private String col;
    /** Stores Select  information */
    private String drop;
    
    public String getCont() {
    	return this.con;
    }

    /**
     * @param path the path to set
     */
    public void setCont(String cont) {
        this.con = cont;
    }
             
    public String getShow() {
        return this.show;
    }
    /**
     * @param path the path to set
     */
    public void setShow(String show) {
        this.show = show;
    }
       
    public String getDate() {
        return this.startDate;
    }
    /**
     * @param path the path to set
     */
    public void setDate(String date) {
        this.startDate = date;
    }
   public String getPath() {
        return this.path;
    }
    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
     
    /**
     * @return the headingText
     */
       
    public String getHeadingText() {
        return headingText;
    }
    /**
     * @param headingText the headingText to set
     */
    public void setHeadingText(String headingText) {
        this.headingText = headingText;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
                 
    public String getFruits() {
        return this.fru;
    }
    /**
     * @param path the path to set
     */
    public void setFruits(String fruit) {
        this.fru = fruit;
    }
    
    public String getColour() {
        return this.col;
    }
    /**
     * @param path the path to set
     */
    public void setColours(String colour) {
        this.col = colour;
    }
    
    public String getDrop() {
        return this.drop;
    }
    /**
     * @param path the path to set
     */
    public void setDrop(String drop) {
        this.drop = drop;
    }
 }