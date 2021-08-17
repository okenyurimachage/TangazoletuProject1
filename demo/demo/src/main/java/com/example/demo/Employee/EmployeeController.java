package com.example.demo.Employee;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Employee.EmployeeService;

import java.time.LocalDate;
import java.util.List;

@ApiOperation(value = "api/v1/employee", tags = "Employee Details ")
@RestController
@RequestMapping(path ="api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){

        this.employeeService = employeeService;
    }

    @ApiOperation(value = "Get all employees", response = Employee.class)
    @GetMapping
    public List<Employee> getEmployees() {
      return employeeService.getEmployees();
    }

    @ApiOperation(value = "Register new employees", response = Employee.class)
    @PostMapping
    public void registerNewEmployee (@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
    }


    }

