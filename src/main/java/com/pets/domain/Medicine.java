package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Medicine extends BaseEntity {
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<MedicineHour> hours;
    @Lob
    private String observations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MedicineHour> getHours() {
        return hours;
    }

    public void setHours(List<MedicineHour> hours) {
        this.hours = hours;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
