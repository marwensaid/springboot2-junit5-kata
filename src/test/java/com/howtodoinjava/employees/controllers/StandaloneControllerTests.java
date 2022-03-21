package com.howtodoinjava.employees.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
// this is a webMVC test for EmployeeController
public class StandaloneControllerTests {

    // mock the EmployeeService bean

    @Autowired
    MockMvc mockMvc;

    // test the findAll method : http code must be 200, and test the first and last name
    @Test
    public void testFindAll() {

    }

}
