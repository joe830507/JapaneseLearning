package lin.japanese.service;

import java.util.List;

import lin.japanese.domain.Alphabet;
import lin.japanese.dto.AlphabetAddDto;

public interface AlphabetService {
	void addAlphabet(AlphabetAddDto addDto);
	public List<Alphabet> getAlphabets();
}
