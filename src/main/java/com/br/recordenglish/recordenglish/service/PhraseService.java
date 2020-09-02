package com.br.recordenglish.recordenglish.service;

import com.br.recordenglish.recordenglish.model.Phrase;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

	public void createPhrase(Phrase phrase) {
		System.out.println(phrase);
	}

}
