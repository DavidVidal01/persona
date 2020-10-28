package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base {
   private String calle;
   private int numero;

   @ManyToOne(optional = false)
   @JoinColumn(name= "fk_localidad")
   private Localidad localidad;
}
