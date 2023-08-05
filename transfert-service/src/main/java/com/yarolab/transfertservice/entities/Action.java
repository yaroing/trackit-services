package com.yarolab.transfertservice.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Action {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
  @JoinColumn(name = "transfert_Id")
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private Transfert transfert;
  private Date dateAction;
  private long typeActionId;
  private String observations;
  private long staffId;

}
