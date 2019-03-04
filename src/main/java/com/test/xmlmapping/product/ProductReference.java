package com.test.xmlmapping.product;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("references")
public class ProductReference {
	
//	@XStreamImplicit(itemFieldName = "reference")
//	private List<String> reference;
	
//	@XStreamConverter(ReferenceConverter.class)
//	@XStreamImplicit(itemFieldName = "reference")
//	private List<Reference> ref;

	private String source;
	private String link;
	
	public ProductReference(String source, String link) {
		this.source = source;
		this.link = link;
	}

	public ProductReference() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductReference [source=" + source + ", link=" + link + "]";
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
