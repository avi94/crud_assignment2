package com.avinandan.ganguly.example_database.repository;

import com.avinandan.ganguly.example_database.bean.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByDesignation(String designation);
}
