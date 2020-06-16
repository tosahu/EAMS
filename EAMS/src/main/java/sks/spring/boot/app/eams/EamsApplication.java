package sks.spring.boot.app.eams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EamsApplication.class, args);
	}

}
