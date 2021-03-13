package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@GetMapping("/")
	String hola() {
		return "Hola Mundo! Proyecto gradle";
	}

}
