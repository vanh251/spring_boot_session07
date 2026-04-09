package ra.edu.service;

import ra.edu.dto.CandidateCreateDTO;
import ra.edu.entity.Candidate;

public interface ICandidateService {
    Candidate createCandidate(CandidateCreateDTO request);
    Candidate updateCandidate(Long id, String address, String bio);
}
