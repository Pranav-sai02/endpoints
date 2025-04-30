package com.neoteric.endpoints.school;


public class StudentDatabaseService {

    public String generateStudentId(Student student){

        return "Narayana" + (Math.random() * 10000);
    }
}
