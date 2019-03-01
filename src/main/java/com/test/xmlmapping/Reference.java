package com.test.xmlmapping;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("reference")
public class Reference {

	@XStreamAlias("href")
	@XStreamAsAttribute
	private String href;
	
	@XStreamAlias("reference")
	private String reference;

	@Override
	public String toString() {
		return "Reference [source =" + reference + ", href=" + href + "] \n ";
	}

}
