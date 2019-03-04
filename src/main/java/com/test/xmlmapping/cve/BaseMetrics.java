package com.test.xmlmapping.cve;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("cvss")
public class BaseMetrics {

	@XStreamAlias("base_metrics")
	private ScoringSystem scoringSystem;

	@Override
	public String toString() {
		return "BaseMetrics [scoringSystem=" + scoringSystem + "]";
	}
	
	
}
