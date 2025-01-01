package com.javarush.lapkin.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "city", schema = "world")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 35)
    private String name;

    @Column(name = "district", nullable = false, length = 20)
    private String district;

    @Column(name = "population", nullable = false)
    private Integer population;

}