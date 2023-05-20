package lin.japanese.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "lin.japanese")
@EnableJpaRepositories
public class JapaneseLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(JapaneseLearningApplication.class, args);
	}
}
