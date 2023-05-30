package lin.japanese.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class AlphabetQueryDto {
	@NotBlank(message = "Category should not be blank")
	private String category;
}
