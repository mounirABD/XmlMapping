package com.test.xmlmapping;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class ReferenceConverter implements Converter{

	public boolean canConvert(Class type) {
		// TODO Auto-generated method stub
		return type.equals(Reference.class);
	}

	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		// TODO Auto-generated method stub
		
	}

	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		// TODO Auto-generated method stub
		Reference r = new Reference();
		r.setHref(reader.getAttribute("href"));
		r.setReference(reader.getValue());
		return r;
	}

}
