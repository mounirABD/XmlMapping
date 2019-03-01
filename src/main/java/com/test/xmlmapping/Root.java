package com.test.xmlmapping;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("cpe-list")
public class Root {

 	@XStreamImplicit(itemFieldName = "cpe-item")
    private List<Product> products = new ArrayList<Product>();

	@Override
	public String toString() {
		return "Root [products=" + products + "]";
	}
	
}
