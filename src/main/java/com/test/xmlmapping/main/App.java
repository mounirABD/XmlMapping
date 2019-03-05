package com.test.xmlmapping.main;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.test.xmlmapping.cve.RootVul;
import com.test.xmlmapping.cve.Vulnerability;
import com.test.xmlmapping.product.Product;
import com.test.xmlmapping.product.ProductReference;
import com.test.xmlmapping.product.Reference;
import com.test.xmlmapping.product.ReferenceConverter;
import com.test.xmlmapping.product.Root;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
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
	public static final String CPE_TEST02 = "test02.xml";
	
    public static void main( String[] args ) throws SAXException, IOException, ParserConfigurationException
    {
    	
    	
    	testVulnerability();
    	

    }
    
    public static void testProduct() {
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
	    		for (ProductReference pr : p.getProdref()) {
	    			System.out.println(" ==> product source  : " + pr.getSource());
	    			System.out.println("      product link : " + pr.getLink());
	    			//System.out.println("");
	    		}
    		}
    		System.out.println("--------------------------------");
    	}
    }
    
    public static void testVulnerability() {
    	
    	XStream xstream = new XStream(new StaxDriver());
    	xstream.ignoreUnknownElements();
    	xstream.setMode(XStream.NO_REFERENCES);
    	xstream.setMode(XStream.SINGLE_NODE_XPATH_RELATIVE_REFERENCES);
    	xstream.setMode(XStream.XPATH_RELATIVE_REFERENCES);
    	
    	xstream.autodetectAnnotations(true);
    	xstream.processAnnotations(new Class[]{RootVul.class});
    	XStream.setupDefaultSecurity(xstream); // to be removed after 1.5
    	xstream.allowTypesByWildcard(new String[] {
    	    "com.test.xmlmapping.**"
    	});
    	
    	
    	xstream.registerConverter(new AbstractSingleValueConverter() {
			@Override
			public Object fromString(String str) {
		    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		    	LocalDateTime dateTime = LocalDateTime.parse(ZonedDateTime.parse(str).format(formatter));
			    return  dateTime;
			}
			@Override
			public boolean canConvert(Class type) {
				return type.equals(LocalDateTime.class);
			}
		});
    	
    	RootVul root = (RootVul) xstream.fromXML(new File("src/main/java/" + CPE_TEST02));
    	
    	System.out.println(root);
    	
    	

    }
    
}
