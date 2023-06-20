package lin.japanese.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lin.japanese.domain.Alphabet;
import lin.japanese.dto.AlphabetQueryDto;
import lin.japanese.dto.ResponseWrapper;
import lin.japanese.service.AlphabetService;

@RestController
@RequestMapping(value = "/api/alphabet")
public class AlphabetController extends BaseController {
	@Autowired
	private AlphabetService alphabetService;

	@GetMapping
	public ResponseEntity<ResponseWrapper> getAlphabets(AlphabetQueryDto queryDto) {
		Map<String, Alphabet> resultMap = alphabetService.getAlphabets(queryDto).stream()
				.collect(Collectors.toMap(item -> item.getJapanese(), item -> item));
		return ResponseEntity.ok(defaultOkWithResBody(resultMap));
	}
}
