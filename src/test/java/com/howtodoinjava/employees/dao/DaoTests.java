package com.howtodoinjava.employees.dao;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
// in this class test we gonna use data jpa
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DaoTests {

    @Autowired
    EmployeeRepository employeeRepository;

    // create three assertion in this test for create, delete and read method (one example)
    @Test
    public void testCreateReadDelete() {
    }
}
