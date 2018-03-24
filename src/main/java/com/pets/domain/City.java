package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class City extends SimpleEntity {
    @ManyToOne
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
