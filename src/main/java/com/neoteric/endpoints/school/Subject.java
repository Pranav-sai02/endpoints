package com.neoteric.endpoints.school;

import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
public class Subject {

    private int studentId;
    private String studentName;
    private List<Grade> grade;
    private Section section;
    private Map<String, Integer> marks;

    public Subject(int studentId, String studentName, List<Grade> grade, Section section, Map<String, Integer> marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.section = section;
        this.marks = marks;
    }
}
