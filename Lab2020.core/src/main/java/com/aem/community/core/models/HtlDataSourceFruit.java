package com.aem.community.core.models;

import java.util.HashMap;
import java.util.Map; 
import java.util.LinkedHashMap;
import java.util.List;
   
import org.apache.sling.api.resource.ResourceMetadata;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.wrappers.ValueMapDecorator;
   
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.iterators.TransformIterator; 
import org.apache.commons.collections.iterators.*;
   
import com.adobe.cq.sightly.WCMUsePojo;
import com.adobe.granite.ui.components.ds.DataSource;
import com.adobe.granite.ui.components.ds.SimpleDataSource;
import com.adobe.granite.ui.components.ds.ValueMapResource;
   
public class HtlDataSourceFruit extends WCMUsePojo
{
   
@Override
 public void activate() throws Exception {
 final ResourceResolver resolver = getResource().getResourceResolver();
   
//Creating the Map instance to insert the countries
 final Map<String, String> fruit = new LinkedHashMap<String, String>();
   
 fruit.put("A", "Apple");
 fruit.put("B", "Banana");
 fruit.put("O", "Orange");
 fruit.put("M", "Mango");
 fruit.put("K", "Kiwi");
 fruit.put("K", "Kiwi");
   
 @SuppressWarnings("unchecked")
   
//Creating the Datasource Object for populating the drop-down control.
 DataSource ds1 = new SimpleDataSource(new TransformIterator(fruit.keySet().iterator(), new Transformer() {
   
 @Override
   
//Transforms the input object into output object
 public Object transform(Object o) {
 String fru = (String) o;
   
//Allocating memory to Map
 ValueMap vm1 = new ValueMapDecorator(new HashMap<String, Object>());
   
//Populate the Map
 vm1.put("value", fru);
 vm1.put("text", fruit.get(fru));
   
 return new ValueMapResource(resolver, new ResourceMetadata(), "nt:unstructured", vm1);
 }
 }));
   
 this.getRequest().setAttribute(DataSource.class.getName(), ds1);
   
 }
}