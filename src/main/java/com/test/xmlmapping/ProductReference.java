package com.test.xmlmapping;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("references")
public class ProductReference {
	
//	@XStreamImplicit(itemFieldName = "reference")
//	private List<String> reference;
	
	@XStreamConverter(ReferenceConverter.class)
	@XStreamImplicit(itemFieldName = "reference")
	private List<Reference> ref;

	@Override
	public String toString() {
		return "ProductReference [ref=" + ref + "]";
	}

	public List<Reference> getRef() {
		return ref;
	}

	public void setRef(List<Reference> ref) {
		this.ref = ref;
	}

	

}
