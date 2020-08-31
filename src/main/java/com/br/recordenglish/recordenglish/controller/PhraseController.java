package com.br.recordenglish.recordenglish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
	
	@GetMapping(value = "/phrase")
	public String getPhrase() {
		return "hello world!";
	}
	
	

}
