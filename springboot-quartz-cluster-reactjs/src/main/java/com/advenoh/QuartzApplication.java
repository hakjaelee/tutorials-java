package kr.pe.advenoh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class QuartzApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuartzApplication.class, args);
	}
}