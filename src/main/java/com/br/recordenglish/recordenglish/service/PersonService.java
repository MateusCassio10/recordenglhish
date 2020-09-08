package com.br.recordenglish.recordenglish.service;

import com.br.recordenglish.recordenglish.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void createPerson(Person person) {
        System.out.println(person);
    }

}
