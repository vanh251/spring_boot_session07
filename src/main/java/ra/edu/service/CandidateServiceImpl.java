package ra.edu.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.dto.CandidateCreateDTO;
import ra.edu.entity.Candidate;
import ra.edu.mapper.CandidateMapper;
import ra.edu.repository.ICandidateRepository;

@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements ICandidateService {

    private final ICandidateRepository candidateRepository;
    @Override
    public Candidate createCandidate(CandidateCreateDTO request) {
        Candidate candidate = CandidateMapper.mapToEntity(request);
        candidateRepository.save(candidate);
        return candidate;
    }

    @Override
    public Candidate updateCandidate(Long id, String address, String bio) {
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        if (candidate != null) {
            candidate.setAddress(address);
            candidate.setBio(bio);
            candidateRepository.save(candidate);
            return candidate;
        } else {
            return null;
        }
    }
}
