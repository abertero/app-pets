package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Commune extends SimpleEntity {
    @ManyToOne
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
