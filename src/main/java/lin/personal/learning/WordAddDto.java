package lin.personal.learning;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class WordAddDto {

	@Column(name = "JAPANESE")
	@NotBlank(message = "Japanese should not be blank")
	private String japanese;
	@Column(name = "ROMA")
	@NotBlank(message = "Roma should not be blank")
	private String roma;
	@Column(name = "CHINESE")
	@NotBlank(message = "Chinese should not be blank")
	private String chinese;

	public Word toWord() {
		return new Word(null, japanese, roma, chinese);
	}
}
