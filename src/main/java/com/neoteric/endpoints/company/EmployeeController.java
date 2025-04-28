package com.neoteric.endpoints.company;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final DatabaseService databaseService;

    public EmployeeController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee) {
        String empId = databaseService.generateEmpId(employee);
        employee.getAddress().setEmpId(empId);
        databaseService.insertEmployee(employee);

        return "Employee created with ID: " + empId;
    }
}
