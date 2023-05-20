package lin.japanese.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "lin.japanese")
@EnableJpaRepositories(basePackages = "lin.japanese.repository")
@EntityScan(basePackages = "lin.japanese.domain")
public class JapaneseLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JapaneseLearningApplication.class, args);
	}
}
