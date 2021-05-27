package hrge.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hrge.model.Employee;
import hrge.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ResponseEntity<Iterable<Employee>>  getEmployees(){
		Iterable<Employee> employees = employeeService.getEmployees();
		System.out.println(employees);
		return ResponseEntity.ok(employees);
		
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") String id){
		return employeeService.getEmployee(id);
	}

}
