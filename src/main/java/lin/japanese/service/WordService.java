package lin.japanese.service;

import java.util.List;

import lin.japanese.dto.WordAddDto;
import lin.japanese.dto.WordInfoDto;

public interface WordService {
	void addWord(WordAddDto addDto);

	List<WordInfoDto> getWords();
}
