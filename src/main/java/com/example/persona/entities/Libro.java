package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class Libro  extends Base{
    private int fecha;
    private String genero;
    private int paginas;
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH )
    private List<Autor> autores;

}
