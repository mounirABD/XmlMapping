package com.test.xmlmapping.product;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("cpe-list")
public class Root {

 	@XStreamImplicit(itemFieldName = "cpe-item")
    private List<Product> products;

	@Override
	public String toString() {
		return "Root [products=" + products + "] \n ";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
