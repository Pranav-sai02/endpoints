package com.neoteric.endpoints.company;

import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DatabaseService {


    public String generateEmpId(Employee employee) {
        return "Neo" + (int) (Math.random() * 10000);
    }

    public String insertEmployee(Employee employee) {
        String generatedEmpId = employee.getEmpId();

        String sql1 = "INSERT INTO employees (empId, employeeName, age, employeeNumber) VALUES (?, ?, ?, ?)";
        String sql2 = "INSERT INTO addresses (state, street, houseNumber, empId) VALUES (?, ?, ?, ?)";
        String sql3 = "INSERT INTO nominee (nomineeName, nomineeAge , nomineeNumber, relationToEmployee, empId) VALUES (?, ?, ?, ?, ?)";
        String sql4 = "INSERT INTO Emails (email, empId) VALUES (?, ?)";
        String sql5 = "INSERT INTO Account (accountType, accountNumber, empId) VALUES (?, ?, ?)";
        String sql6 = "INSERT INTO Certificates (certificate, empId) VALUES (?, ?)";

        try (Connection connection = MySqlConnection.getConnection()) {

            try (PreparedStatement statement1 = connection.prepareStatement(sql1)) {
                statement1.setString(1, generatedEmpId);
                statement1.setString(2, employee.getEmployeeName());
                statement1.setInt(3, employee.getAge());
                statement1.setLong(4, employee.getEmployeeNumber());
                statement1.executeUpdate();
            }


            try (PreparedStatement statement2 = connection.prepareStatement(sql2)) {
                statement2.setString(1, employee.getAddress().getState());
                statement2.setString(2, employee.getAddress().getStreet());
                statement2.setString(3, employee.getAddress().getHouseNumber());
                statement2.setString(4, generatedEmpId);
                statement2.executeUpdate();
            }


            try (PreparedStatement statement3 = connection.prepareStatement(sql3)) {
                for (Nominee nominee : employee.getNominee()) {
                    statement3.setString(1, nominee.getNomineeName());
                    statement3.setInt(2, nominee.getNomineeAge());
                    statement3.setLong(3, nominee.getNomineeNumber());
                    statement3.setString(4, nominee.getRelationToEmployee());
                    statement3.setString(5, generatedEmpId);

                    statement3.addBatch();
                }
                statement3.executeBatch();
            }


            try (PreparedStatement statementEmail = connection.prepareStatement(sql4)) {
                for (Email emailObj : employee.getEmail()) {
                    statementEmail.setString(1, emailObj.getEmail());
                    statementEmail.setString(2, generatedEmpId);
                    statementEmail.addBatch();
                }
                statementEmail.executeBatch();
            }



            try (PreparedStatement statementBank = connection.prepareStatement(sql5)) {
                for (Account account : employee.getBankAccounts()) {
                    statementBank.setString(1, account.getAccountType());
                    statementBank.setString(2, account.getAccountNumber());
                    statementBank.setString(3, generatedEmpId);
                    statementBank.addBatch();
                }
                statementBank.executeBatch();
            }


            try (PreparedStatement statementCertificate = connection.prepareStatement(sql6)) {
                for (Certificates certificates : employee.getCertificates()) {
                    statementCertificate.setString(1, certificates.getCertificate());
                    statementCertificate.setString(2, generatedEmpId);
                    statementCertificate.addBatch();
                }
                statementCertificate.executeBatch();
            }



        } catch (SQLException e) {
            System.out.println("Error occurred while inserting employee: " + e.getMessage());
        }

        return generatedEmpId;
    }
}

