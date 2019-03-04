package com.test.xmlmapping;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamContainedType;
import com.thoughtworks.xstream.annotations.XStreamInclude;

@XStreamAlias("reference")
public class Reference {

	@XStreamAlias("href")
	@XStreamAsAttribute
	private String href;
	
	private String reference;

	@Override
	public String toString() {
		return " \n Reference [source =" + reference + ", href=" + href + "] \n ";
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	
	
}
