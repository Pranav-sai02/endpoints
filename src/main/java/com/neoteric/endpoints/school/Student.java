package com.neoteric.endpoints.school;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Student {

    private String studentName;
    private String studentAge;
    private String aClass;
    private List<Subject> subjects;

    public Student(String studentName, String studentAge, String aClass, List<Subject> subjects) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        aClass = aClass;
        this.subjects = subjects;
    }
}
