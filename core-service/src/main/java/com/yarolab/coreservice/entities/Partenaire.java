package com.yarolab.coreservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Partenaire {

  @Id
  private String id;
  private String nom;
  private String autreNom;
  private String telephone;
  private String email;
  private String localite;
  @OneToMany(mappedBy = "partenaire")
  private List<Service> services;
  @ManyToOne
  @JoinColumn(name = "region_id")
  private Region region;


}
