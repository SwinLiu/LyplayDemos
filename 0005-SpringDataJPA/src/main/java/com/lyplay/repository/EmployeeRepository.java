package com.lyplay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyplay.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findById(Long id);

}
