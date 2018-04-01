package com.pets.domain;

import com.pets.enums.NotificationType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Notification extends BaseEntity {
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String description;
    @Enumerated
    private NotificationType type;
}
