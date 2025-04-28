package com.neoteric.endpoints.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloWorld {


    private static Map<String, SpringDemo> employeeMap = new HashMap<>();
    private static Map<String, Address> employeeAddressMap = new HashMap<>();


    static {
        SpringDemo e1 = new SpringDemo("Neo123", "Pranav", 10000.0);
        SpringDemo e2 = new SpringDemo("Neo456", "Ganesh", 15000.0);

        employeeMap.put(e1.getEmpId(), e1);
        employeeMap.put(e2.getEmpId(), e2);

        Address add1 = new Address("telangana","rkh colony","road number 4");
        Address add2 = new Address("chennai","rkh colony","road number 4");

        employeeAddressMap.put(add1.state,add1);
        employeeAddressMap.put(add2.state,add2);

    }


    @GetMapping("getEmp/{empId}")
    public SpringDemo findEmployee(@PathVariable String empId) {
        System.out.println("Fetching employee with empId: " + empId);
        SpringDemo employee = employeeMap.get(empId);
        if (employee == null) {
            System.out.println("Employee not found!");
        } else {
            System.out.println("Employee found: " + employee);
        }
        return employee;
    }


}
