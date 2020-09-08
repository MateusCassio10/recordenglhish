package com.br.recordenglish.recordenglish.service;

import com.br.recordenglish.recordenglish.model.Phrase;
import com.br.recordenglish.recordenglish.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

	@Autowired
	private PhraseRepository phraseRepository;

	public void createPhrase(Phrase phrase) {
		Phrase phraseSaved = phraseRepository.save(phrase);
	}

}
