package lin.japanese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lin.japanese.domain.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
}
