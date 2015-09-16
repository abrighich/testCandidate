package com.test.candidate.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * Created by oleg on 12/08/15.
 */
@Component
@Path("/test")
public class CandidateService {
	
	//The bean will inject by Spring IoC
	@Autowired
	private InterfaceCandidateService candidateService ;
	
	
	@GET
	@Path("/candidates")
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	List<Candidate> findAll(){
		return candidateService.findAll();;
	}
	
	@POST
	@Path("/candidates")
	void addCandidate(@PathParam(value="candidate")Candidate candidate){
		candidateService.addCandidate(Candidate candidate);
	}
	
	@DELETE
	@Path("/comptes/{candidate}")
	void deleteCandidate(@PathParam(value="candidate")Candidate candidate){
		candidateService.deleteCandidate(Candidate candidate);
	}
	
	@PUT
	@Path("/comptes/{candidate}")//I replace id by object
	void editCandidate(@PathParam(value="candidate")Candidate candidate){
		candidateService.editCandidate(Candidate candidate);
	}
}
