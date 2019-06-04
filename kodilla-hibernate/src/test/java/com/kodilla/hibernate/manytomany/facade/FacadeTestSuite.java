package com.kodilla.hibernate.manytomany.facade;

        import com.kodilla.hibernate.manytomany.Company;
        import com.kodilla.hibernate.manytomany.Employee;
        import com.kodilla.hibernate.manytomany.dao.CompanyDao;
        import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testEmployeeAndCompanyWithLettersNamedQueries() {
        //Given
        Employee employee1 = new Employee("Kate", "Kowalska");
        Employee employee2 = new Employee("John", "Smith");

        Company company1 = new Company("Apple");
        Company company2 = new Company("Ceneo");

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
        List<Company> companiesWithLettersList = companyDao.findCompaniesWithLetters("%ppl%");
        List<Employee> employeesWithLettersList = employeeDao.findEmployeeWithLetters("%mit%");

        //Then
        Assert.assertEquals("Apple", companiesWithLettersList.get(0).getName());
        Assert.assertEquals("Smith", employeesWithLettersList.get(0).getLastname());

        //CleanUp
//        companyDao.deleteById(id3);
//        companyDao.deleteById(id4);
    }

}
