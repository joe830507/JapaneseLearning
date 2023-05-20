package lin.japanese.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lin.japanese.dto.ResponseWrapper;
import lin.japanese.dto.WordAddDto;
import lin.japanese.service.WordService;

@RestController
@RequestMapping("/api/word")
public class WordController extends BaseController {

	@Autowired
	private WordService wordService;

	@GetMapping
	public ResponseEntity<ResponseWrapper> getWords() {
		return ResponseEntity.ok(defaultOkWithResBody(wordService.getWords()));
	}

	@PostMapping
	public ResponseEntity<ResponseWrapper> addWord(@RequestBody @Valid WordAddDto addDto) {
		wordService.addWord(addDto);
		return ResponseEntity.ok(defaultOk());
	}
}
