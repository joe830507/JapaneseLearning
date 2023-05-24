package lin.japanese.dto;

import javax.validation.constraints.NotBlank;

import lin.japanese.domain.Word;
import lombok.Data;

@Data
public class WordAddDto {

	@NotBlank(message = "Japanese should not be blank")
	private String japanese;
	@NotBlank(message = "Roma should not be blank")
	private String roma;
	@NotBlank(message = "Chinese should not be blank")
	private String chinese;
	@NotBlank(message = "JapaneseSentence should not be blank")
	private String japaneseSentence;
	@NotBlank(message = "ChineseSententce should not be blank")
	private String chineseSententce;

	public Word toWord() {
		return new Word(null, japanese, chinese, japaneseSentence, chineseSententce);
	}
}
