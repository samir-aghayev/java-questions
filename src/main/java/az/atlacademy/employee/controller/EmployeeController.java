package az.atlacademy.employee.controller;

import az.atlacademy.employee.model.Employee;
import az.atlacademy.employee.service.EmployeeService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employers")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{pin}")
    public ResponseEntity<Optional<Employee>> findByPin(@NotBlank @PathVariable String pin) {
        return ResponseEntity.ok(employeeService.findEmployeeByPin(pin));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @PostMapping
    public ResponseEntity<Employee> createdEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
    }


    @DeleteMapping("/{pin}")
    public void deleteEmployeeByPin(@NotBlank @PathVariable String pin) {
        employeeService.deleteEmployeeByPin(pin);
    }
}
