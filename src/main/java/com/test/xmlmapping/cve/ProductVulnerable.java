package com.test.xmlmapping.cve;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("vulnerable-software-list")
//@XStreamConverter(value = ToAttributedValueConverter.class, strings= {"product"})
public class ProductVulnerable {

	@XStreamImplicit(itemFieldName = "product")
	private List<String> cpeVul;

	@Override
	public String toString() {
		return "ProductVulnerable [cpeVul=" + cpeVul + "]";
	}
	
	
	
}
