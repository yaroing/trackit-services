package com.yarolab.partenaireservice.models;


import lombok.Data;


@Data
public class Partenaire {

  private String id;
  private String nom;
  private String autreNom;
  private String telephone;
  private String email;
  private String localite;
}
