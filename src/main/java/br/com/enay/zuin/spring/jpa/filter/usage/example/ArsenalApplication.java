package br.com.enay.zuin.spring.jpa.filter.usage.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/** Main class for the AppArsenal application. */

// Utilizar basePackage apenas do projeto
@EntityScan(basePackages = "br.com.enay.zuin.spring.jpa.filter.usage.example.entity")
//Utilizar basePackage do projeto e da library - sempre será br.com.enay.zuin.spring.jpa.filter
@ComponentScan(basePackages = { "br.com.enay.zuin.spring.jpa.filter", "br.com.enay.zuin.spring.jpa.filter.usage.example" })
//Utilizar basePackage apenas do projeto
@EnableJpaRepositories(basePackages = { "br.com.enay.zuin.spring.jpa.filter.usage.example.repository" })
@EnableJpaAuditing
@SpringBootApplication
public class ArsenalApplication {

	/**
	 * Main method for initializing the AppArsenal application.
	 *
	 * @param args execution arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ArsenalApplication.class, args);
	}
}
