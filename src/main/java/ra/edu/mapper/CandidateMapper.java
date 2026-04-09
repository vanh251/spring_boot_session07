package ra.edu.mapper;

import ra.edu.dto.CandidateCreateDTO;
import ra.edu.entity.Candidate;

public class CandidateMapper {
    public static Candidate mapToEntity(CandidateCreateDTO candidateCreateDTO) {
        Candidate candidate = new Candidate();
        candidate.setFullName(candidateCreateDTO.getFullName());
        candidate.setEmail(candidateCreateDTO.getEmail());
        candidate.setAge(candidateCreateDTO.getAge());
        candidate.setYearOfExperience(candidateCreateDTO.getYearOfExperience());
        candidate.setAddress(candidateCreateDTO.getAddress());
        candidate.setBio(candidateCreateDTO.getBio());
        candidate.setPhone(candidateCreateDTO.getPhone());
        return candidate;
    }
}
