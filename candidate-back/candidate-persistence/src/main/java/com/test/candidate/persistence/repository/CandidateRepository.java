package com.test.candidate.persistence.repository;

/**
 * Created by oleg on 09/08/15.
 */
//TODO create CandidateRepository interface
public interface CandidateRepository {

	List<Candidate> findAll();
	void editCandidate(Candidate candidate);
	void addCandidate(Candidate candidate);
	void deleteCandidate(Candidate candidate);
}
