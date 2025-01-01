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
@Table(name = "country_language", schema = "world")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "language", nullable = false, length = 30)
    private String language;

    @Column(name = "is_official", nullable = false)
    private Boolean isOfficial = false;

    @Column(name = "percentage", nullable = false, precision = 4, scale = 1)
    private BigDecimal percentage;

}