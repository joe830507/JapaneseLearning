package lin.personal.learning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphabetServiceImpl implements AlphabetService {

	@Autowired
	AlphabetRespoitory alphabetRespoitory;

	@Override
	public List<Alphabet> getWords() {
		return alphabetRespoitory.findAll();
	}

}
