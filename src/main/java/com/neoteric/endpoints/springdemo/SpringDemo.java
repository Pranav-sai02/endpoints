package com.neoteric.endpoints.springdemo;

public class SpringDemo {
    private String empId;
    private String name;
    private double sal;

    public SpringDemo(){

    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public SpringDemo(String empId, String name, double sal) {
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
}