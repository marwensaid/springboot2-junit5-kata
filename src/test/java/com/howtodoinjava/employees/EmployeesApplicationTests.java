package com.howtodoinjava.employees;

import com.howtodoinjava.employees.controllers.EmployeeController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EmployeesApplicationTests {

    @Autowired
    EmployeeController employeeController;

    // only test our controller is not null
    @Test
    public void contextLoads() {
    }
}
