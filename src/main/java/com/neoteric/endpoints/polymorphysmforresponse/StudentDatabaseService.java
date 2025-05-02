package com.neoteric.endpoints.polymorphysmforresponse;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public String generateStudentId(Students students) {
        return "Neo" + (int)(Math.random() * 10000);
    }

    public String insertStudent(Students students) {
        String generatedStudentId = generateStudentId(students);
        students.setStudentId(generatedStudentId);

        String sql1 = "INSERT INTO students (studentId, studentName, studentAge) VALUES (?, ?, ?)";
        String sql2 = "INSERT INTO marks (studentId, subject, marks) VALUES (?, ?, ?)";

        try {

            jdbcTemplate.update(sql1,
                    generatedStudentId,
                    students.getStudentName(),
                    students.getStudentAge());


            List<Subjects> subjects = students.getSubjects();
            for (Subjects subjects1 : subjects) {
                jdbcTemplate.update(sql2,
                        generatedStudentId,
                        subjects1.getSubject(),
                        subjects1.getMarks());
            }

        } catch (Exception e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }

        return generatedStudentId;
    }

    public Students getStudentById(String studentId) {
        String studentSql = "SELECT * FROM students WHERE studentId = ?";

        Students student = jdbcTemplate.queryForObject(studentSql, new Object[]{studentId}, (rs, rowNum) -> {
            Students s = new Students();
            s.setStudentId(rs.getString("studentId"));
            s.setStudentName(rs.getString("studentName"));
            s.setStudentAge(rs.getInt("studentAge"));
            return s;
        });

        String marksSql = "SELECT * FROM marks WHERE studentId = ?";
        List<Subjects> subjects = jdbcTemplate.query(marksSql, new Object[]{studentId}, (rs, rowNum) -> {
            Subjects subject = new Subjects();
            subject.setSubject(rs.getString("subject"));
            subject.setMarks(rs.getInt("marks"));
            return subject;
        });

        student.setSubjects(subjects);
        return student;
    }

}
