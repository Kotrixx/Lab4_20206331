package com.example.lab4.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<com.example.lab4.entidad.Department, Integer> {
}
