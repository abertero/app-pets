package com.pets.domain;

import com.pets.enums.LengthScale;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

@Entity
public class Carer extends Person {
    private Double placeOfCareHeight;
    private Double placeOfCareWidth;
    private Double placeOfCareLength;
    @Enumerated
    private LengthScale lengthScale;
    @Lob
    private String associatedGrades;

    public Double getPlaceOfCareHeight() {
        return placeOfCareHeight;
    }

    public void setPlaceOfCareHeight(Double placeOfCareHeight) {
        this.placeOfCareHeight = placeOfCareHeight;
    }

    public Double getPlaceOfCareWidth() {
        return placeOfCareWidth;
    }

    public void setPlaceOfCareWidth(Double placeOfCareWidth) {
        this.placeOfCareWidth = placeOfCareWidth;
    }

    public Double getPlaceOfCareLength() {
        return placeOfCareLength;
    }

    public void setPlaceOfCareLength(Double placeOfCareLength) {
        this.placeOfCareLength = placeOfCareLength;
    }

    public LengthScale getLengthScale() {
        return lengthScale;
    }

    public void setLengthScale(LengthScale lengthScale) {
        this.lengthScale = lengthScale;
    }

    public String getAssociatedGrades() {
        return associatedGrades;
    }

    public void setAssociatedGrades(String associatedGrades) {
        this.associatedGrades = associatedGrades;
    }
}
