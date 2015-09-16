
public interface InterfaceCandidateService {
	List<Candidate> findAll();
	void editCandidate(Candidate candidate);
	void addCandidate(Candidate candidate);
	void deleteCandidate(Candidate candidate);
}
