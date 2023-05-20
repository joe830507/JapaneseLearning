package lin.japanese.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WordInfoDto {
	private String japanese;
	private String roma;
	private String chinese;
}
