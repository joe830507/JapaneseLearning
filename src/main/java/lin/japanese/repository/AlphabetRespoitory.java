package lin.japanese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lin.japanese.domain.Alphabet;

@Repository
public interface AlphabetRespoitory extends JpaRepository<Alphabet, Long> {

}
