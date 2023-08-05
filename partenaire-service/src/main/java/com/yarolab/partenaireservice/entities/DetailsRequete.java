package com.yarolab.partenaireservice.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yarolab.partenaireservice.models.Catalogue;
import com.yarolab.partenaireservice.models.Partenaire;
import com.yarolab.partenaireservice.models.Section;
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
public class DetailsRequete {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "requete_id")
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Requete requete;
  private String catalogueId;
  private double quantiteDemandee;
  private double quantiteApprouvee;
  private double quantiteRecue;
  private String observations;
  @Transient
  private Catalogue catalogue;

}
