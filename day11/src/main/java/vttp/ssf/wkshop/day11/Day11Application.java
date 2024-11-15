package vttp.ssf.wkshop.day11;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Day11Application.class);
		String port = "8080";

		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port"))
			port = cliOpts.getOptionValues("port").get(0);

		app.setDefaultProperties(
			Collections.singletonMap("server.port", port)
		);
		
		System.out.printf("Application started on port %s", port);
		app.run(args);
	}

}
