package com.yarolab.transfertservice.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yarolab.transfertservice.models.Catalogue;
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
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "transfert_Id")
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Transfert transfert;
  private long waybill;
  private long releaseOrder;
  private Date dateRo;
  private String materialId;
  private String matDesc;
  private String unit;
  private double delQty;
  private double value;
  private String batch;
  private Date bbDate;
  private double weight;
  private double volume;
  private double recQty;
  @Transient
  private Catalogue catalogue;


}
