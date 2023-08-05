package com.yarolab.pointservice.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Service {

  private long id;;
  private String nom;
  private double longitude;
  private double latitude;
  private String nomContact;
  private String telephone;
}
