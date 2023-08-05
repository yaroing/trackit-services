package com.yarolab.partenaireservice.entities;


import com.yarolab.partenaireservice.models.Partenaire;
import com.yarolab.partenaireservice.models.Section;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Requete {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String partenaireId;
  private long sectionId;
  private Date dateRequete;
  private String fichierAttache;
  private String observations;
  private long statutRequete;
  @OneToMany(mappedBy = "requete")
  private List<DetailsRequete> detailsRequetes;
  @Transient
  private Section section;
  @Transient
  private Partenaire partenaire;

}
