package com.auth0.questionmark.attempt;

import com.auth0.questionmark.alternative.Alternative;
import com.auth0.questionmark.user.User;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "alternative_id")
    private Alternative alternative;

    @NotNull
    private Date date;

    private boolean correct;
}
