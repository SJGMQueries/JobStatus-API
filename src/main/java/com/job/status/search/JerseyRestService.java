package com.job.status.search;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/services")
public class JerseyRestService {

	@Path("/getStatus")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public JobStatusResponse getStatus(JobStatusRequest request) {
		List<Job> jobs = request.getJobs();
		JobStatusResponse response = new JobStatusResponse();
		if (jobs.toString().contains("Not Ok")) {
			response.setFlag(false);
			response.setInaccessibility(findRepeatStatus(request)
					+ "(status is other than OK)");
		} else {
			response.setFlag(true);
		}
		return response;
	}

	private int findRepeatStatus(JobStatusRequest request) {
		int count = 0;
		for (Job job : request.getJobs()) {
			if (job.getStatus().equalsIgnoreCase("Not Ok")) {
				count++;
			}
		}
		return count;
	}
}
