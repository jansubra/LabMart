package com.aem.community.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
 
import com.aem.community.core.models.HeroTextBean; 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
 
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
@Model(adaptables = Resource.class)
public class HeroSlingModel {
     
    private final Logger LOG = LoggerFactory.getLogger(getClass());
     
    //Get all dialog fields by using the inject annotation
    @Inject @Optional
    public String heading;
  
    @Inject @Optional
    public String description;
     
    @Inject @Optional
    public String path;
     
    @Inject @Optional
    public String startdate;
     
    @Inject @Optional
    public String show;
     
    @Inject @Optional
    public String cont;
    
    @Inject @Optional
    public String fruit;
    
    @Inject @Optional
    public String colour;
    
    @Inject @Optional
    public String dd;
    
     
    /** The hero text bean. */
    private HeroTextBean heroTextBean = null;
     
    @PostConstruct
    protected void init() {
        LOG.info("In the  **** INIT *** method");
         
        heroTextBean = new HeroTextBean();
         
        //Set the Bean with all the dialog values
        heroTextBean.setHeadingText(heading);
        heroTextBean.setDescription(description); 
        heroTextBean.setPath(path); 
        heroTextBean.setDate(startdate); 
         
  //If checkbox is unchecked
  if (show == null)
            heroTextBean.setShow("off");
        else
               heroTextBean.setShow(show);
        heroTextBean.setCont(cont);
        heroTextBean.setFruits(fruit);
        heroTextBean.setColours(colour);
        heroTextBean.setDrop(dd);
        
      
    }
    public HeroTextBean getHeroTextBean() {
        return this.heroTextBean;
    }
}
