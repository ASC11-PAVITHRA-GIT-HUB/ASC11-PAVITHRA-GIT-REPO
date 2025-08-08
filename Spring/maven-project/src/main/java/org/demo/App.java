package org.demo;

import org.demo.entity.EmployeeEntity;
import org.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to our Java App!");
        SpringApplication.run(App.class, args);
        System.err.println("Welcome to our Spring App!");
//        System.out.println(EmployeeData.getAllEmployees());
    }
}
//http://localhost:8080/api/v1/getEmployeesAsMap---> to run this in website use this command
