package com.test.xmlmapping;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static final String CPE_NAME = "official-cpe-dictionary_v2.3.xml";
	public static final String CPE_TEST = "test.xml";
	
    public static void main( String[] args ) throws SAXException, IOException, ParserConfigurationException
    {
    	
    	
    	XStream xstream = new XStream(new StaxDriver());
    	xstream.ignoreUnknownElements();
    	xstream.setMode(XStream.NO_REFERENCES);
    	xstream.setMode(XStream.SINGLE_NODE_XPATH_RELATIVE_REFERENCES);
    	xstream.setMode(XStream.XPATH_RELATIVE_REFERENCES);
    	
    	xstream.autodetectAnnotations(true);
    	xstream.processAnnotations(new Class[]{Root.class, Product.class, ProductReference.class, Reference.class});
    	XStream.setupDefaultSecurity(xstream); // to be removed after 1.5
    	xstream.allowTypesByWildcard(new String[] {
    	    "com.test.xmlmapping.**"
    	});
    	
    	
    	xstream.registerConverter(new ReferenceConverter());
    	
    	Root root = (Root) xstream.fromXML(new File("src/main/java/" + CPE_TEST));
    	
    	for(Product p : root.getProducts()) {
    		System.out.println("--------------------------------");
    		System.out.println(" product name : " + p.getName());
    		System.out.println(" product title : " + p.getTitle());
    		if(p.getProdref() != null) {
	    		for (Reference r : p.getProdref().getRef()) {
	    			System.out.println(" ==> product source  : " + r.getReference());
	    			System.out.println("      product link : " + r.getHref());
	    			//System.out.println("");
	    		}
    		}
    		System.out.println("--------------------------------");
    	}
    	

    }
}
