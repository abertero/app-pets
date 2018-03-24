package com.pets.domain;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends BaseEntity {
    private String name;
    private String surname;
    private String secondSurname;
    private String taxNumber; // RUT
    private String passportId;
    private String photoUrl;
    private String address;
    private Boolean addressVisible;
    private String phoneNumber;
    private Boolean phoneNumberVisible;
    @ManyToOne
    private Commune commune;
    private Double averageScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getAddressVisible() {
        return addressVisible;
    }

    public void setAddressVisible(Boolean addressVisible) {
        this.addressVisible = addressVisible;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getPhoneNumberVisible() {
        return phoneNumberVisible;
    }

    public void setPhoneNumberVisible(Boolean phoneNumberVisible) {
        this.phoneNumberVisible = phoneNumberVisible;
    }

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }
}
