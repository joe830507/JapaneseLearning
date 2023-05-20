package lin.japanese.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lin.japanese.dto.WordAddDto;
import lin.japanese.repository.WordRepository;
import lin.japanese.service.WordService;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordRepository wordRepository;

	@Override
	public void addWord(WordAddDto addDto) {
		wordRepository.save(addDto.toWord());
	}

}
