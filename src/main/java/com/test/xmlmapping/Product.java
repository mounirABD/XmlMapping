package com.test.xmlmapping;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("cpe-item")
public class Product {

	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	
	@XStreamAlias("title")
	private String title;
	
	@XStreamAlias("references")
	private ProductReference prodref;

	@Override
	public String toString() {
		return "\n Product [nom=" + name + ", title=" + title + ", \n references =" + prodref + "] \n ";
	}

	
	
	public ProductReference getProdref() {
		return prodref;
	}



	public void setProdref(ProductReference prodref) {
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
