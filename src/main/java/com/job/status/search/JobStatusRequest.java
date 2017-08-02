package com.job.status.search;

import java.io.Serializable;
import java.util.List;

public class JobStatusRequest implements Serializable {
	private List<Job> jobs = null;

	private boolean success;
	private final static long serialVersionUID = -1534652110166472623L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public JobStatusRequest() {
	}

	/**
	 * 
	 * @param jobs
	 * @param success
	 */
	public JobStatusRequest(List<Job> jobs, boolean success) {
		super();
		this.jobs = jobs;
		this.success = success;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobs == null) ? 0 : jobs.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobStatusRequest other = (JobStatusRequest) obj;
		if (jobs == null) {
			if (other.jobs != null)
				return false;
		} else if (!jobs.equals(other.jobs))
			return false;
		if (success != other.success)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JobStatusRequest [jobs=" + jobs + ", success=" + success + "]";
	}

}
