package com.test.xmlmapping.cve;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("base_metrics")
public class ScoringSystem {

	@XStreamAlias("score")
	private Double score;
	
	@XStreamAlias("access-vector")
	private String accessVector;
	
	@XStreamAlias("access-complexity")
	private String accessComplexity;
	
	@XStreamAlias("authentication")
	private String authentification;
	
	@XStreamAlias("confidentiality-impact")
	private String confidentialityImpact;
	
	@XStreamAlias("integrity-impact")
	private String integrityImpact;
	
	@XStreamAlias("availability-impact")
	private String availabilityImpact;
	
	@XStreamAlias("source")
	private String source;
	
	@XStreamAlias("generated-on-datetime")
	private Date generatedOnDateTime;

	@Override
	public String toString() {
		return "ScoringSystem [score=" + score + ", accessVector=" + accessVector + ", accessComplexity="
				+ accessComplexity + ", authentification=" + authentification + ", confidentialityImpact="
				+ confidentialityImpact + ", integrityImpact=" + integrityImpact + ", availabilityImpact="
				+ availabilityImpact + ", source=" + source + ", generatedOnDateTime=" + generatedOnDateTime + "]";
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getAccessVector() {
		return accessVector;
	}

	public void setAccessVector(String accessVector) {
		this.accessVector = accessVector;
	}

	public String getAccessComplexity() {
		return accessComplexity;
	}

	public void setAccessComplexity(String accessComplexity) {
		this.accessComplexity = accessComplexity;
	}

	public String getAuthentification() {
		return authentification;
	}

	public void setAuthentification(String authentification) {
		this.authentification = authentification;
	}

	public String getConfidentialityImpact() {
		return confidentialityImpact;
	}

	public void setConfidentialityImpact(String confidentialityImpact) {
		this.confidentialityImpact = confidentialityImpact;
	}

	public String getIntegrityImpact() {
		return integrityImpact;
	}

	public void setIntegrityImpact(String integrityImpact) {
		this.integrityImpact = integrityImpact;
	}

	public String getAvailabilityImpact() {
		return availabilityImpact;
	}

	public void setAvailabilityImpact(String availabilityImpact) {
		this.availabilityImpact = availabilityImpact;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getGeneratedOnDateTime() {
		return generatedOnDateTime;
	}

	public void setGeneratedOnDateTime(Date generatedOnDateTime) {
		this.generatedOnDateTime = generatedOnDateTime;
	}
	
	
	
	
}
