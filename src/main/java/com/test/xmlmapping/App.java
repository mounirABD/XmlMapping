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
    	
    	
    	XStream xstream = new XStream();
    	xstream.ignoreUnknownElements();
    	xstream.autodetectAnnotations(true);
    	xstream.processAnnotations(new Class[]{Root.class, Product.class, ProductReference.class});
    	XStream.setupDefaultSecurity(xstream); // to be removed after 1.5
    	xstream.allowTypesByWildcard(new String[] {
    	    "com.test.xmlmapping.**"
    	});
    	
    	
    	//xstream.alias("cpe-list",Root.class);
    	
        //xstream.alias("cpe-item", Product.class);
        //xstream.aliasField("title", Product.class, "title");
        //xstream.aliasField("title", Product.class, "title");

       //xstream.alias("item", Item.class);
    	
    	//xstream.addImplicitCollection(Root.class, "products");
    	Root root = (Root) xstream.fromXML(new File("src/main/java/" + CPE_TEST));
    	
    	System.out.println("Produit | " + root);
    	
    	
    	
		/*
		 * Node first = doc.getElementsByTagName("tutorial").item(1); NodeList nodeList
		 * = first.getChildNodes(); int n = nodeList.getLength(); Node current; for (int
		 * i=0; i<n; i++) { current = nodeList.item(i); if(current.getNodeType() ==
		 * Node.ELEMENT_NODE) { System.out.println( current.getNodeName() + ": " +
		 * current.getTextContent()); } }
		 */
    	
		/*
		 * DocumentBuilder builder =
		 * DocumentBuilderFactory.newInstance().newDocumentBuilder(); Document doc =
		 * builder.parse(new File("src/main/java/" + CPE_TEST));
		 * doc.getDocumentElement().normalize();
		 * 
		 * NodeList nodetutorial = doc.getElementsByTagName("cpe-item"); NodeList
		 * nodeList; for (int i=0; i<nodetutorial.getLength(); i++) { nodeList =
		 * nodetutorial.item(i).getChildNodes(); Node node; for(int j=0;
		 * i<nodeList.getLength(); j++) { node = nodeList.item(j); if(node.getNodeType()
		 * == Node.ELEMENT_NODE) { System.out.println( node.getNodeName() + ": " +
		 * node.getTextContent()); } } }
		 */
    	

    }
}