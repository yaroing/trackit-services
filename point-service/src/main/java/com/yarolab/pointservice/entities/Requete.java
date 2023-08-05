package com.yarolab.pointservice.entities;


import com.yarolab.pointservice.models.Catalogue;
import com.yarolab.pointservice.models.Service;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Requete {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long serviceId;
  private String catalogueId;
  private double quantiteDisponible;
  private double quantiteDemandee;
  private double quantiteTrsanferee;
  private double quantiteRecue;
  private long statutRequete;
  private Date dateRequete;
  private Date dateTransfert;
  private Date dateReception;
  @Transient
  private Service service;
  @Transient
  private Catalogue catalogue;

}
