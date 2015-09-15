package com.test.candidate.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oleg on 12/08/15.
 */
@RestController
@RequestMapping("/candidate")
//TODO
public class CandidateController {
	
	@Autowired
	private CandidateServiceImpl candidateService,;

	@RequestMapping(value="/saveCandidate")
	public void addCandidate(Model model,Candidate candidate){
		candidateService.addCandidate(candidate)
	}
	
	@RequestMapping(value="/editCandidate")
	public void editCandidate(Model model,Candidate candidate){
		candidateService.editCandidate(candidate)
	}
	
	@RequestMapping(value="/listCandidate")
	public List<Candidate> listCandidate(Model model){
		candidateService.findAll()
	}
	
	@RequestMapping(value="/deleteCandidate")
	public void deleteCandidate(Model model,Candidate candidate){
		candidateService.deleteCandidate(candidate)
	}

}
