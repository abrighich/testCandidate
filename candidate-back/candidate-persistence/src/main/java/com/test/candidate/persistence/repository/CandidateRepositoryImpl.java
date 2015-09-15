package com.test.candidate.persistence.repository;

@Repository("candiateRepository")
public class CandidateRepositoryImpl implements CandidateRepository{

	@Autowired
	private SessionFactory sessionFactory ;
	
	List<Candidate> findAll(){
		List<Candidate> result = sessionFactory.getCurrentSession().createCriteria(Candidate.class).list();
		Set<Candidate> list = new HashSet<Candidate>(result);
		return list;
	}
	
	void editCandidate(Candidate candidate){
		sessionFactory.getCurrentSession().merge(Candidate);
	}
	
	void addCandidate(Candidate candidate){
		sessionFactory.getCurrentSession().persist(Candidate);
	}
	void deleteCandidate(Candidate candidate){
		sessionFactory.getCurrentSession().remove(Candidate);
	}
}
