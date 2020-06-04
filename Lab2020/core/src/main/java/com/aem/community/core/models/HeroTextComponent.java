package com.aem.community.core.models;
import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.community.core.models.HeroTextBean;
   
public class HeroTextComponent
extends WCMUsePojo
{
   
     /** The hero text bean. */
    private HeroTextBean heroTextBean = null;
        
    @Override
    public void activate() throws Exception {
            
         heroTextBean = new HeroTextBean();
                
        //Get the values that the author entered into the AEM dialog
        String heading = getProperties().get("heading", "");
        String description = getProperties().get("description","");
        String path = getProperties().get("path","");
        String date = getProperties().get("startdate","");
        String show = getProperties().get("show","");
        String type = getProperties().get("size","");
        String fruits = getProperties().get("fruit","");
        String drop = getProperties().get("dd","");
       
      
         //Set the Bean with all the dialog values
        heroTextBean.setHeadingText(heading);
        heroTextBean.setDescription(description); 
        heroTextBean.setPath(path); 
        heroTextBean.setDate(date); 
        heroTextBean.setShow(show);
        heroTextBean.setType(type);
        heroTextBean.setFruits(fruits);
        heroTextBean.setDrop(drop);
              }
        
  public HeroTextBean getHeroTextBean() {
        return this.heroTextBean;
    }
}