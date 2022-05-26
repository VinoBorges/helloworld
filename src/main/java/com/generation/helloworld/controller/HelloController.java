package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*indica que é uma classe controller*/
@RequestMapping("/hello") /*indica que controla o /hello*/
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return"Hello World!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return"<b>BSMs Generation Brasil</b> "
				+ "<br /> <br /> <b>Mentalidades:</b> "
				+ "<br /> Mentalidade de crescimento "
				+ "<br /> Orientação ao futuro "
				+ "<br /> Responsabilidade pessoal "
				+ "<br /> Persistencia "
				+ "<br /> <br /> <b>Habilidades:</b> "
				+ "<br /> Trabalho em equipe "
				+ "<br /> Orientação ao detalhe"
				+ "<br /> Proatividade "
				+ "<br /> Comunicação";		
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return"<b>Ojetivos de aprendizado da semana</b> "
				+ "<br /> -Reforçar os conteúdos conceituais e práticos de MySQL"
				+ "<br /> -Reforçar os conteúdos conceituais e práticos de Spring Boot";
	}
}
