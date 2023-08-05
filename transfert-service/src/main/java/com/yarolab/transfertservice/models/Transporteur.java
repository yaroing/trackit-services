package com.yarolab.transfertservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Transporteur {

  private long id;
  private String nom;
  private String nomContact;
  private String telephone;
  private String email;

}
