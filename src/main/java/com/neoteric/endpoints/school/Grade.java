package com.neoteric.endpoints.school;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Grade {

    private String subject;

    private String grade;

    private String academicYear;

    private String studentClass;

    public Grade(String subject, String grade, String academicYear, String studentClass) {
        this.subject = subject;
        this.grade = grade;
        this.academicYear = academicYear;
        this.studentClass = studentClass;
    }
}
