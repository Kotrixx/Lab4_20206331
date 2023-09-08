package com.example.lab4.controlador;

import com.example.lab4.repositorio.DepartmentRepository;
import com.example.lab4.repositorio.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    final EmployeeRepository employeeRepository;
    final DepartmentRepository departmentRepository;
    final Country
    public HomeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }


    @GetMapping(value = "/")
    public String home(Model model ) {
        model.addAttribute("listaDep", employeeRepository.findAll());
        model.addAttribute("listaEmployee", employeeRepository.findAll());

        model.addAttribute("listaEmployee", employeeRepository.findAll());
        return "index";
    }

}
