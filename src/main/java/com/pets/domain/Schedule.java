package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Schedule extends BaseEntity {
    @ManyToOne
    private Carer carer;
    private Integer dayOfWeek;
    private Integer hourOfDayFrom;
    private Integer minuteOfDayFrom;
    private Integer hourOfDayTo;
    private Integer minuteOfDayTo;

    public Carer getCarer() {
        return carer;
    }

    public void setCarer(Carer carer) {
        this.carer = carer;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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
}
