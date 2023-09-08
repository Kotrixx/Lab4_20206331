package com.example.lab4.repositorio;
import com.example.lab4.entidad.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(nativeQuery = true, value = "select * from employees where first_name like %?1% or last_name like %?1%")
    List<Employee> findByFirstNameAndLastName(String texto);

}
