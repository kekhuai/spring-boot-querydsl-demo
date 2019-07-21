package com.example.querydsldemo.repository;

import com.example.querydsldemo.domain.Person;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>,
    QuerydslPredicateExecutor<Person> {

  Stream<PersonWithCard> findAllProjectionBy();

  interface PersonWithCard {
    String getFirstName();

    String getLastName();

    @Value("#{target.citizenCard.verificationNumber}")
    String getVerificationNumber();
  }

}
