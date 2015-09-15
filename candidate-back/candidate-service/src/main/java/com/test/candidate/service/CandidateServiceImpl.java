
@Transactional
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	private CandidateRepository candidateRepository ;
	
	List<Candidate> findAll(){
		return candidateRepository..findAll();;
	}
	
	void editCandidate(Candidate candidate){
		candidateRepository.update(document);
	}
	
	void addCandidate(Candidate candidate){
		candidateRepository.addCandidate(Candidate candidate);
	}
	
	void deleteCandidate(Candidate candidate){
		candidateRepository.deleteCandidate(Candidate candidate);
	}

}
