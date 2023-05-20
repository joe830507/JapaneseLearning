package lin.japanese.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lin.japanese.domain.Alphabet;
import lin.japanese.repository.AlphabetRespoitory;
import lin.japanese.service.AlphabetService;

@Service
public class AlphabetServiceImpl implements AlphabetService {

	@Autowired
	AlphabetRespoitory alphabetRespoitory;

	@Override
	public List<Alphabet> getWords() {
		return alphabetRespoitory.findAll();
	}

}
