package com.test.xmlmapping;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("cpe-item")
public class Product {

	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	
	@XStreamAlias("title")
	private String title;
	
	//@XStreamImplicit(itemFieldName = "references")
	@XStreamAlias("references")
	//@XStreamImplicit
	private List<ProductReference> prodref = new ArrayList<ProductReference>();

	@Override
	public String toString() {
		return "\n Product [name=" + name + ", title=" + title + ", \n prodref=" + prodref + "] \n ================= \n ";
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

	public List<ProductReference> getProdref() {
		return prodref;
	}

	public void setProdref(List<ProductReference> prodref) {
		this.prodref = prodref;
	}
	
	
	
	
	
}
