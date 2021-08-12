package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayRollServiceTest {
    @Test
    public void given3Employees_WhenWriitenToFile_ShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(1, "Gagan Reddy", 700000.00),
                new EmployeePayrollData(2, "Shravya Reddy", 400000.00),
                new EmployeePayrollData(3, "Dilip Gowda", 300000.00)
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeePayrollService.writingData(EmployeePayrollService.IOService.FILE_IO);

        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assertions.assertEquals(3, entries);
    }
}