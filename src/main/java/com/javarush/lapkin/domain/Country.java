package com.javarush.lapkin.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "country", schema = "world")
public class Country {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "code", nullable = false, length = 3)
    private String code;

    @Column(name = "code_2", nullable = false, length = 2)
    private String code2;

    @Column(name = "name", nullable = false, length = 52)
    private String name;

    @Column(name = "continent", nullable = false)
    private Integer continent;

    @Column(name = "region", nullable = false, length = 26)
    private String region;

    @Column(name = "surface_area", nullable = false, precision = 10, scale = 2)
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short indepYear;

    @Column(name = "population", nullable = false)
    private Integer population;

    @Column(name = "life_expectancy", precision = 3, scale = 1)
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp", precision = 10, scale = 2)
    private BigDecimal gnp;

    @Column(name = "gnpo_id", precision = 10, scale = 2)
    private BigDecimal gnpoId;

    @Column(name = "local_name", nullable = false, length = 45)
    private String localName;

    @Column(name = "government_form", nullable = false, length = 45)
    private String governmentForm;

    @Column(name = "head_of_state", length = 60)
    private String headOfState;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "capital")
    private City capital;

}