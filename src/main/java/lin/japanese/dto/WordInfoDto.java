package lin.japanese.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WordInfoDto {
	private Long id;
	private String japanese;
	private String chinese;
	private String japaneseSentence;
	private String chineseSententce;
}
