package com.yarolab.pointservice.entities;


import com.yarolab.pointservice.models.Catalogue;
import com.yarolab.pointservice.models.Service;
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
public class Stock {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long serviceId;
  private String annee;
  private String mois;
  private String catalogueId;
  private double quantiteDebut;
  private double quantiteEntree;
  private double quantiteSortie;
  private double quantiteFinale;
  @Transient
  private Service service;
  @Transient
  private Catalogue catalogue;

}
