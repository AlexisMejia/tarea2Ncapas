package com.uca.capas.tarea2Ncapas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.tarea2Ncapas.controller"))
@ComponentScan(basePackages=("com.uca.capas.tarea2.domain"))
public class Tarea2NcapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tarea2NcapasApplication.class, args);
	}

}
