package com.auth0.questionmark.exam;

import com.auth0.questionmark.exam.dto.ExamDTO;
import com.auth0.questionmark.util.Check;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamRestController {
    private ExamRepository examRepository;

    public ExamRestController(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @GetMapping
    public List<Exam> getExams() {
        return examRepository.findAll();
    }

    @PostMapping
    public void addExam(@RequestBody ExamDTO examDTO) {
        examRepository.save(examDTO.newExam());
    }

    @PutMapping(path = "/{id}")
    public void editExam(@PathVariable long id, @RequestBody ExamDTO examDTO) {
        final Exam exam = examRepository.findOne(id);
        Check.isNotNull(exam, "exam.error.notFound", id);
        exam.update(examDTO);
        examRepository.save(exam);
    }
}
