package lin.japanese.service;

import java.util.List;

import lin.japanese.domain.Alphabet;
import lin.japanese.dto.AlphabetQueryDto;

public interface AlphabetService {
	public List<Alphabet> getAlphabets(AlphabetQueryDto queryDto);
}
