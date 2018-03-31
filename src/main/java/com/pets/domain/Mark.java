package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Mark extends BaseEntity {
    private Double score;
    @ManyToOne
    private Carer carer;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Pet pet;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Integer hourOfDayFrom;
    private Integer minuteOfDayFrom;
    private Integer hourOfDayTo;
    private Integer minuteOfDayTo;
    @Lob
    private String observations;

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Carer getCarer() {
        return carer;
    }

    public void setCarer(Carer carer) {
        this.carer = carer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHourOfDayFrom() {
        return hourOfDayFrom;
    }

    public void setHourOfDayFrom(Integer hourOfDayFrom) {
        this.hourOfDayFrom = hourOfDayFrom;
    }

    public Integer getMinuteOfDayFrom() {
        return minuteOfDayFrom;
    }

    public void setMinuteOfDayFrom(Integer minuteOfDayFrom) {
        this.minuteOfDayFrom = minuteOfDayFrom;
    }

    public Integer getHourOfDayTo() {
        return hourOfDayTo;
    }

    public void setHourOfDayTo(Integer hourOfDayTo) {
        this.hourOfDayTo = hourOfDayTo;
    }

    public Integer getMinuteOfDayTo() {
        return minuteOfDayTo;
    }

    public void setMinuteOfDayTo(Integer minuteOfDayTo) {
        this.minuteOfDayTo = minuteOfDayTo;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
