package com.example.querydsldemo.domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CITIZEN_ID")
public class CitizenCard {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private int id;

  @Column(name = "DATE_OF_ISSUE")
  private LocalDate dateOfIssue;

  @Column(name = "DATE_OF_EXPIRY")
  private LocalDate dateOfExpiry;

  @Column(name = "VERIFICATION_NUMBER")
  private String verificationNumber;

  @OneToOne(mappedBy = "citizenCard")
  private Person person;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDate getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public LocalDate getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(LocalDate dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getVerificationNumber() {
    return verificationNumber;
  }

  public void setVerificationNumber(String verificationNumber) {
    this.verificationNumber = verificationNumber;
  }
}
