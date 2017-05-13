package org.shaun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/spring/inbound-rest.xml")
public class SpringIntegrationRestApplication {

	public static void main(String[] args) {
          ConfigurableApplicationContext ctx = 
                  new SpringApplication(SpringIntegrationRestApplication.class).run(args);
          while (true) {
            //allows the thing to run
          }
	}
}
