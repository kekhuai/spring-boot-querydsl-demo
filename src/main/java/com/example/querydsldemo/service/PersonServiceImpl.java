package com.example.querydsldemo.service;

import com.example.querydsldemo.repository.PersonRepository;
import com.example.querydsldemo.repository.PersonRepository.PersonWithCard;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  @Transactional
  public List<PersonWithCard> fetchPersonWithCard() {
    return personRepository.findAllProjectionBy().collect(Collectors.toList());
  }
}
