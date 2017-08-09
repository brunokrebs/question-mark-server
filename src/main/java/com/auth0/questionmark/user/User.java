package com.auth0.questionmark.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {
    @Id
    private String id;

    @NotNull
    private String name;
}
