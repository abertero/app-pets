package com.pets.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class MedicineHour extends BaseEntity {
    @ManyToOne
    private Medicine medicine;
    private Integer hour;
    private Integer minute;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }
}
