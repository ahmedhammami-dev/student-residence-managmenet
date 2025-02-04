package tn.esprit.tp_foyer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@EnableScheduling
@SpringBootApplication
public class TpFoyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpFoyerApplication.class, args);
	}
	@Scheduled(fixedRate = 6000)
	public void fixedRateMethod() {
		log.info("this is me");
	}

}
