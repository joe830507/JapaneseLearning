package lin.personal.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordRepository wordRepository;

	@Override
	public void addWord(WordAddDto addDto) {
		wordRepository.save(addDto.toWord());
	}

}
