package com.example.querydsldemo.service;

import com.example.querydsldemo.repository.PersonRepository.PersonWithCard;
import java.util.List;

public interface PersonService {

  List<PersonWithCard> fetchPersonWithCard();

}
