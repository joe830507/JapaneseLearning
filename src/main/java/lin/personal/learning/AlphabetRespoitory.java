package lin.personal.learning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlphabetRespoitory extends JpaRepository<Alphabet, Long> {

}
