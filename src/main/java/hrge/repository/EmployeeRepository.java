package hrge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hrge.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
