package com.job.status.search;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JobStatusResponse {

	private boolean flag;
	private String inaccessibility;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getInaccessibility() {
		return inaccessibility;
	}

	public void setInaccessibility(String inaccessibility) {
		this.inaccessibility = inaccessibility;
	}

}
