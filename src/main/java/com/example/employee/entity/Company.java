package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Liu
 */
@Entity
public class Company {

    @Id
    private long id;
    private String companyName;
    private Integer employeesNumber;

    public Company(long id, String companyName, Integer employeesNumber) {
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
