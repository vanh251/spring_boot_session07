package ra.edu.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.edu.dto.ApiResponse;
import ra.edu.dto.CandidateCreateDTO;
import ra.edu.dto.CandidateUpdateDTO;
import ra.edu.entity.Candidate;
import ra.edu.service.ICandidateService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CandidateController {
    private final ICandidateService candidateService;

    @PostMapping("/api/candidates")
    public ResponseEntity<?> createCandidate(@Valid @RequestBody CandidateCreateDTO candidateCreateDTO){
        Candidate candidate = candidateService.createCandidate(candidateCreateDTO);
        ApiResponse<Candidate> response = new ApiResponse<>("success", "Ứng viên được tạo thành công", candidate);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/api/candidates/{id}")
    public ResponseEntity<?> updateCandidate(@PathVariable Long id, @ModelAttribute CandidateUpdateDTO candidateUpdateDTO) {
        String address = candidateUpdateDTO.getAddress();
        String bio = candidateUpdateDTO.getBio();
        Candidate updatedCandidate = candidateService.updateCandidate(id, address, bio);
        if (updatedCandidate != null) {
            ApiResponse<Candidate> response = new ApiResponse<>("success", "Ứng viên được cập nhật thành công", updatedCandidate);
            return ResponseEntity.ok(response);
        } else {
            ApiResponse<String> response = new ApiResponse<>("error", "Không tìm thấy ứng viên với ID: " + id, null);
            return ResponseEntity.status(404).body(response);
        }
    }
}
