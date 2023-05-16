package lin.personal.learning;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/alphabet")
public class AlphabetController {

	@Autowired
	private AlphabetService alphabetService;

	@PostMapping
	public ResponseEntity<String> addWord(@RequestBody String input){
		return null;
	}
	
	@GetMapping
	public ResponseEntity<Map<String,String>> getWords(){
		Map<String, String> resultMap = alphabetService.getWords().stream()
				.collect(Collectors.toMap(item -> item.getJapanese(), item -> item.getRoma()));
		return ResponseEntity.ok(resultMap);
	}
}
