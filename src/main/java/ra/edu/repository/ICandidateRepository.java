package ra.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.edu.entity.Candidate;

public interface ICandidateRepository extends JpaRepository<Candidate, Long> {
}
