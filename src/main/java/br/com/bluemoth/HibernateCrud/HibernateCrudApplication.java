package br.com.bluemoth.HibernateCrud;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HibernateCrudApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8080"));
        app.run(args);
	}

}
