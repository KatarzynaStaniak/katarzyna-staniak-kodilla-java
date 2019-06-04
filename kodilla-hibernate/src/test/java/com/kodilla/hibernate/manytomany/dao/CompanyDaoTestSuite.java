package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testEmployeeAndCompanyNamedQueries() {
        //Given
        Employee employee1 = new Employee("Peter", "Nowak");
        Employee employee2 = new Employee("Natalie", "Kovalsky");

        Company company1 = new Company("Google");
        Company company2 = new Company("Allegro");

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee2);

        employeeDao.save(employee1);
        int id1 = employee1.getId();
        employeeDao.save(employee2);
        int id2 = employee2.getId();
        companyDao.save(company1);
        int id3 = company1.getId();
        companyDao.save(company2);
        int id4 = company2.getId();

        //When
        List<Employee> employeesList = employeeDao.findEmployeeByLastname("Nowak");
        List<Company> companiesList = companyDao.companiesBeginningWithLetters("All");

        //Then
        Assert.assertEquals("Nowak", employeesList.get(0).getLastname());
        Assert.assertEquals("Allegro", companiesList.get(0).getName());

        //CleanUp
//        companyDao.deleteById(id3);
//        companyDao.deleteById(id4);
    }

}
