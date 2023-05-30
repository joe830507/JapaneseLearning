package lin.japanese.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TB_ALPHABET")
@NoArgsConstructor
@AllArgsConstructor
public class Alphabet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "JAPANESE")
	private String japanese;
	@Column(name = "ROMA")
	private String roma;
	/**
	 * A:平假名, A-1:平假名-濁音、半濁音, A-2:平假名-抝音1, A-3:平假名-抝音2, B:片假名, B-1:片假名-濁音、半濁音,
	 * B-2:片假名-抝音1, B-3:片假名-抝音2
	 */
	@Column(name = "CATEGORY")
	private String category;
}
