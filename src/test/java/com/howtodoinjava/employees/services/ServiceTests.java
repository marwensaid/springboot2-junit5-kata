package com.howtodoinjava.employees.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

// this class test should extend a mockito
public class ServiceTests {
    // inject employee service mock

    // init EmployeeRepository mock

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    // use a mock to test a find method ( create a fake data to test)
    void testFindAllEmployees() {
    }

    // use a mock to test create and save method. use the mockito verify here
    @Test
    void testCreateOrSaveEmployee() {
    }
}
