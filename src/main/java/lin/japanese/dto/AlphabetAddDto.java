package lin.japanese.dto;

import javax.validation.constraints.NotBlank;

import lin.japanese.domain.Alphabet;
import lombok.Data;

@Data
public class AlphabetAddDto {
	@NotBlank(message = "Japanese should not be blank")
	private String japanese;
	@NotBlank(message = "Roma should not be blank")
	private String roma;

	public Alphabet toAlphabet() {
		return new Alphabet(null, japanese, roma);
	}
}
