package com.test.xmlmapping;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("reference")
public class ProductReference {
	
	@XStreamAlias("reference")
	private String source;
	
	@XStreamAlias("href")
	@XStreamAsAttribute
	private String link;
	
	@Override
	public String toString() {
		return "ProductReference [source=" + source + ", link=" + link + "] \n ";
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	

}
