package com.job.status.search;

import java.io.Serializable;

public class Job implements Serializable {
	private String status;

	private long jobId;
	private final static long serialVersionUID = -7044313185604383251L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Job() {
	}

	/**
	 * 
	 * @param jobId
	 * @param status
	 */
	public Job(String status, long jobId) {
		super();
		this.status = status;
		this.jobId = jobId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "Job [status=" + status + ", jobId=" + jobId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (jobId ^ (jobId >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Job other = (Job) obj;
		if (jobId != other.jobId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
