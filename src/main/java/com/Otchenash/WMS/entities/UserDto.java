package com.Otchenash.WMS.entities;

public class UserDto {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  
  public UserDto(User user) {
    this.id = user.getId();
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
    this.email = user.getEmail();
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

}

