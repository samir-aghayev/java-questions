package az.atlacademy.employee.service;

import az.atlacademy.employee.model.Employee;
import az.atlacademy.employee.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Optional<Employee> findEmployeeByPin(String pin) {
        return employeeRepository.findEmployeeByPin(pin);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployeeByPin(String pin) {
        employeeRepository.deleteEmployeeByPin(pin);
    }
}
