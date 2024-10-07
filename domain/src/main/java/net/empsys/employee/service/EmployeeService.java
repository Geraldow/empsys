package net.empsys.employee.service;

import net.empsys.employee.contract.CrudMethods;
import net.empsys.employee.model.Employee;

public class EmployeeService implements CrudMethods<Employee, Integer> {

    // Create
    @Override
    public Employee createEntity(Employee entity) {
        return null;
    }


    // Read
    @Override
    public Employee searchEntityById(Integer integer) {
        return null;
    }

    // Read
    @Override
    public Employee[] searchAllEntities() {
        return new Employee[0];
    }


    // Update
    @Override
    public Employee updateEntity(Employee entity) {
        return null;
    }


    // Delete
    @Override
    public void deleteEntityByID(Integer integer) {

    }
}
