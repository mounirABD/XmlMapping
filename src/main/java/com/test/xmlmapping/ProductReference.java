package com.test.xmlmapping;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("references")
public class ProductReference {
	
	@XStreamImplicit(itemFieldName = "reference")
	private List<Reference> reference;
	

	@Override
	public String toString() {
		return " ProductReference [reference =" + reference + "] \n ";
	}


	public List<Reference> getReference() {
		return reference;
	}


	public void setReference(List<Reference> reference) {
		this.reference = reference;
	}
	
	
	

}
