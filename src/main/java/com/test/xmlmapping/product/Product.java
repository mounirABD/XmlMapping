package com.test.xmlmapping.product;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.collections.ArrayConverter;

@XStreamAlias("cpe-item")
public class Product {

	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	
	@XStreamAlias("title")
	private String title;
	

	@XStreamConverter(ReferenceConverter.class)
	@XStreamImplicit(itemFieldName = "references")
	private List<ProductReference> prodref;

	@Override
	public String toString() {
		return "\n Product [nom=" + name + ", title=" + title + ", \n references =" + prodref + "] \n ";
	}

	
	
	public List<ProductReference> getProdref() {
		return prodref;
	}



	public void setProdref(List<ProductReference> prodref) {
		this.prodref = prodref;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	
	
	
	
	
}
