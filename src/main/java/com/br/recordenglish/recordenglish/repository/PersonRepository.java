package com.br.recordenglish.recordenglish.repository;

import com.br.recordenglish.recordenglish.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
