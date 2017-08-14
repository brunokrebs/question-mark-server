package com.auth0.questionmark.exam.dto;

import com.auth0.questionmark.exam.Exam;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ExamDTO {
    @NotNull
    @Size(min = 1, max = 50)
    private String title;

    @NotNull
    @Size(min = 1, max = 512)
    private String description;

    public final Exam newExam() {
        Exam exam = new Exam();
        exam.setTitle(title);
        exam.setDescription(description);
        return exam;
    }
}
