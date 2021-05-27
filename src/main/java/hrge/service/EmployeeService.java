package hrge.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrge.model.Employee;
import hrge.repository.EmployeeRepository;
import lombok.Data;

@Data
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Optional<Employee> getEmployee(String id){
		return employeeRepository.findById(Long.valueOf(id));
	}
	
	public Iterable<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
