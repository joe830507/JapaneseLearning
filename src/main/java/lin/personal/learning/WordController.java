package lin.personal.learning;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/word")
public class WordController {

	@Autowired
	private WordService wordService;

	@PostMapping
	public ResponseEntity<String> addWord(@RequestBody @Valid WordAddDto addDto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			String messages = bindingResult.getAllErrors().stream().map(item -> item.getDefaultMessage())
					.collect(Collectors.joining(","));
			return ResponseEntity.ok(messages);
		}
		wordService.addWord(addDto);
		return ResponseEntity.ok("OK");
	}
}
