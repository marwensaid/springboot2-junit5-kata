package com.howtodoinjava.employees.services;

import com.howtodoinjava.employees.dao.EmployeeRepository;
import com.howtodoinjava.employees.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

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
