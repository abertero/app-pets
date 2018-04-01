package com.pets.enums;

public enum NotificationType {
    CONTACT(1, "contact"),
    END_OF_SERVICE(2, "endofservice"),
    CALIFICATION(3, "calification");

    private Integer id;
    private String description;

    NotificationType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
