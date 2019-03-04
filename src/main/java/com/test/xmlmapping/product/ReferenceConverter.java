package com.test.xmlmapping.product;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class ReferenceConverter implements Converter{

	public boolean canConvert(Class type) {
		// TODO Auto-generated method stub
		
		return type.equals(ProductReference.class);
	}

	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		// TODO Auto-generated method stub
		
	}

	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		// TODO Auto-generated method stub
		ProductReference pr = null;
		System.out.println("parent : " + reader.getNodeName());
		while (reader.hasMoreChildren()) {
			
			reader.moveDown();
			System.out.println("child : " + reader.getNodeName());
			String nodeName = reader.getNodeName();
			if("reference".equalsIgnoreCase(nodeName)) {
				pr = new ProductReference();
				pr.setLink(reader.getAttribute("href"));
				pr.setSource(reader.getValue());
				
			}
			reader.moveUp();
		}
		
		return pr;
		
//		Reference r = new Reference();
//		r.setHref(reader.getAttribute("href"));
//		r.setReference(reader.getValue());
//		return r;
	}

}
