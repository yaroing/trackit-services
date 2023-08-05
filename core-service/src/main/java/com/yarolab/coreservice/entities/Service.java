package com.yarolab.coreservice.entities;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service {

  @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "partenaire_id")
  private Partenaire partenaire;
  private String nom;
  @Column(nullable = true)
  private double longitude;
  @Column(nullable = true)
  private double latitude;
  private String nomContact;
  private String telephone;


}
