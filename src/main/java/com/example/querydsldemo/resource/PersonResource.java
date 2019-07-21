package com.example.querydsldemo.resource;

import com.example.querydsldemo.repository.PersonRepository.PersonWithCard;
import com.example.querydsldemo.service.PersonService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/person")
public class PersonResource {

  private final PersonService personService;

  public PersonResource(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping
  public List<PersonWithCard> allPersonWithCard() {
    return personService.fetchPersonWithCard();
  }
}
