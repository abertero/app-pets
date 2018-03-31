package com.pets.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.TableGenerator;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @TableGenerator(name = "appSeqStore", table = "app_seq_store", pkColumnName = "APP_SEQ_NAME",
            pkColumnValue = "APP_SEQ_GEN", valueColumnName = "APP_SEQ_VALUE", initialValue = 1, allocationSize = 1)
    protected Long id;
    protected String altKey;

    @PrePersist
    public void generateAltKey() {
        this.altKey = UUID.randomUUID().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAltKey() {
        return altKey;
    }

    public void setAltKey(String altKey) {
        this.altKey = altKey;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this).toString();
    }
}
