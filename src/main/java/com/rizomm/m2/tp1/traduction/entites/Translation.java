package com.rizomm.m2.tp1.traduction.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String language;

    @OneToMany(cascade = ALL)
    @JoinColumn(name = "entry_id")
    private List<Entry> entries;
}
