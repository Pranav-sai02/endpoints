package com.neoteric.endpoints.company;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Employee {


    private String employeeName;
    private int age;
    private long employeeNumber;
    private Address address;
    private List<Nominee> nominee;
    private List<Email> Email;
    private List<Account> BankAccounts;
    private List<Certificates> certificates;


    public Employee(String employeeName, int age, long employeeNumber, Address address, List<Nominee> nominee, List<Email> email, List<Account> bankAccounts, List<Certificates> certificates) {
        this.employeeName = employeeName;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.address = address;
        this.nominee = nominee;
        Email = email;
        BankAccounts = bankAccounts;
        this.certificates = certificates;
    }
}


