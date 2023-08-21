package az.atlacademy.employee.repository;

import az.atlacademy.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    Optional<Employee> findEmployeeByPin(String pin);

    void deleteEmployeeByPin(String pin);


}
