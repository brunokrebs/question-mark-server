package com.auth0.questionmark.question;

import com.auth0.questionmark.exam.Exam;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "exam_id")
    private Exam exam;

    private long order;

    @NotNull
    private String description;
}