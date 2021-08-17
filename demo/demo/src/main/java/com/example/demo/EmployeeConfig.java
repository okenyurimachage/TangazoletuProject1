package com.example.demo;


import com.example.demo.Employee.Employee;
import com.example.demo.Employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
        return args -> {

            Employee Sandra = new Employee(
                    "Sandra Ngetich",
                    "Sandra@gmail.com",
                    LocalDate.of(1997, Month.APRIL, 21),
                    25

            );

            Employee Blasio = new Employee(
                    "Blasio Owino",
                    "BlasioOwino@gmail.com",
                    LocalDate.of(1997, Month.APRIL, 21),
                    25

            );

            repository.saveAll(List.of(Sandra, Blasio)
            );


        };
    }
}
