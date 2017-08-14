package com.auth0.questionmark.exam.dto;

import com.auth0.questionmark.exam.Exam;
import lombok.Data;

@Data
public class ExamDTO {
    private String title;
    private String description;

    public final Exam newExam() {
        Exam exam = new Exam();
        exam.setTitle(title);
        exam.setDescription(description);
        return exam;
    }
}
