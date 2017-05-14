package org.shaun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/spring/inbound-rest.xml")
public class SpringIntegrationRestApplication {

	public static void main(String[] args) {
          ApplicationContext context = SpringApplication.run(SpringIntegrationRestApplication.class, args);
	}
}
