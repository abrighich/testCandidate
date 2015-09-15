package com.test.candidate.service;

import org.springframework.stereotype.Component;

/**
 * Created by oleg on 12/08/15.
 */

public interface CandidateService {
	List<Candidate> findAll();
	void editCandidate(Candidate candidate);
	void addCandidate(Candidate candidate);
	void deleteCandidate(Candidate candidate);
}
