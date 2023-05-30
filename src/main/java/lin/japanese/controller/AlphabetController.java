package lin.japanese.controller;

import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lin.japanese.dto.AlphabetAddDto;
import lin.japanese.dto.AlphabetQueryDto;
import lin.japanese.dto.ResponseWrapper;
import lin.japanese.service.AlphabetService;

@RestController
@RequestMapping(value = "/api/alphabet")
public class AlphabetController extends BaseController {

	@Autowired
	private AlphabetService alphabetService;

	@PostMapping
	public ResponseEntity<ResponseWrapper> addAlphabet(@RequestBody AlphabetAddDto addDto) {
		alphabetService.addAlphabet(addDto);
		return ResponseEntity.ok(defaultOk());
	}

	@GetMapping
	public ResponseEntity<ResponseWrapper> getAlphabets(@Valid AlphabetQueryDto queryDto) {
		Map<String, String> resultMap = alphabetService.getAlphabets(queryDto).stream()
				.collect(Collectors.toMap(item -> item.getJapanese(), item -> item.getRoma()));
		return ResponseEntity.ok(defaultOkWithResBody(resultMap));
	}
}
