package com.test.xmlmapping.cve;

import java.util.List;

import com.test.xmlmapping.product.Product;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("nvd")
public class RootVul {

	@XStreamImplicit(itemFieldName = "entry")
    private List<Vulnerability> vulnerabilities;

	@Override
	public String toString() {
		return "Root [vulnerabilities=" + vulnerabilities + "]";
	}
	
	
	
}
