package com.howtodoinjava.employees.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

// use spring extension class
// this is a spring boot test
public class IntegrationTests {

    @Autowired
    EmployeeController employeeController;

    // create new employee add test if it exists
    // after creation use delete method and verify if employee is really deleted
    @Test
    public void testCreateReadDelete() {

    }

    // test if EmployeeController catch our custom error
    @Test
    public void errorHandlingValidationExceptionThrown() {

    }
}
