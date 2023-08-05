package com.yarolab.transfertservice.entities;


import com.yarolab.transfertservice.models.Catalogue;
import com.yarolab.transfertservice.models.Partenaire;
import com.yarolab.transfertservice.models.Section;
import com.yarolab.transfertservice.models.Transporteur;
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
public class Transfert {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Date dateExpedition;
  private long sectionId;
  private String partenaireId;
  private long transporteurId;
  private String nomChauffeur;
  private Date dateReception;
  private long statutTransfert;
  private String personneContact;
  private String phoneContact;
  @OneToMany(mappedBy = "transfert")
  private List<Article> articles;
  @OneToMany(mappedBy = "transfert")
  private List<Action> actions;
  @Transient
  private Section section;
  @Transient
  private Partenaire partenaire;
  @Transient
  private Catalogue catalogue;
  @Transient
  private Transporteur transporteur;

}
