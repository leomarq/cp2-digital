package com.fiap.digital.cp2.repository;

import com.fiap.digital.cp2.domain.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByNameEquals(String department_name);

}