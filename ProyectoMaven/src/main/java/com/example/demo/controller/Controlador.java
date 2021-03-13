package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@RequestMapping("/")
	String hola() {
		return "Hola Mundo!";
	}

}
