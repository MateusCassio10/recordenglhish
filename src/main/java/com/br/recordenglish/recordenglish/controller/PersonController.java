package com.br.recordenglish.recordenglish.controller;

import com.br.recordenglish.recordenglish.model.Person;
import com.br.recordenglish.recordenglish.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "/person")
    public String getPerson() {
        return "hello world!";
    }

    @PostMapping(value = "/person")
    public String createPerson(@RequestBody Person person) {
        service.createPerson(person);
        return person.getName();

    }
}
