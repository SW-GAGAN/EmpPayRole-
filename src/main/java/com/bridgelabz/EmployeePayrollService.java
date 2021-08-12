package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {

    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
    }

    // parameterized constructor for initializing list
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /*To Read data from the Console using Scanner
     *Data Stored in Name,Id,Salary
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Please enter Employee Name");
        String name = consoleInputReader.nextLine();
        System.out.println("Please enter Employee ID");
        int id = consoleInputReader.nextInt();
        System.out.println("Please enter Employee Salary");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /*
     * to write into the console
     */
    private void writeEmployeePayrollData() {
        System.out.println("\n Writing Employee Payroll Roster to Console\n" + employeePayrollList);
    }

    /*
     * main method
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll service program !");
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
}