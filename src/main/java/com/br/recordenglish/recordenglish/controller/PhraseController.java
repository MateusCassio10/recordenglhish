package com.br.recordenglish.recordenglish.controller;

import com.br.recordenglish.recordenglish.model.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.recordenglish.recordenglish.service.PhraseService;

@RestController
public class PhraseController {
	@Autowired
	private PhraseService service;
	
	@GetMapping(value = "/phrase")
	public String getPhrase() {
		return "hello world!";
	}
	
	@PostMapping(value = "/phrase")
	public String createPhrase(@RequestBody Phrase phrase) {
		service.createPhrase(phrase);
		return "create";
		
	}
	

}
