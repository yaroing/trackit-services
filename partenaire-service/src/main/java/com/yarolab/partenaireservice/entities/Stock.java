package com.yarolab.partenaireservice.entities;


import com.yarolab.partenaireservice.models.Catalogue;
import com.yarolab.partenaireservice.models.Partenaire;
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
  private String partenaireId;
  private String annee;
  private String mois;
  private String catalogueId;
  private double quantiteDebut;
  private double quantiteEntree;
  private double quantiteSortie;
  private double quantiteFinale;
  @Transient
  private Partenaire partenaire;
  @Transient
  private Catalogue catalogue;

}
