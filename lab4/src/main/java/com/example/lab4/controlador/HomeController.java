package com.example.lab4.controlador;

import com.example.lab4.entidad.Department;
import com.example.lab4.entidad.Employee;
import com.example.lab4.repositorio.CountryRepository;
import com.example.lab4.repositorio.DepartmentRepository;
import com.example.lab4.repositorio.EmployeeRepository;
import com.example.lab4.repositorio.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    final EmployeeRepository employeeRepository;
    final DepartmentRepository departmentRepository;
    final CountryRepository countryRepository;
    final LocationRepository locationRepository;
    public HomeController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, CountryRepository countryRepository, LocationRepository locationRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.countryRepository = countryRepository;
        this.locationRepository = locationRepository;
    }


    @GetMapping(value = "/")
    public String home(Model model ) {
        model.addAttribute("listaDep", departmentRepository.findAll());
        List<Department> listaDep = departmentRepository.findAll();
        model.addAttribute("listaCiudad", locationRepository.findAll());
        model.addAttribute("listaEmployee", employeeRepository.findAll());
        return "index";
    }
    @PostMapping(value = "/buscar")
    public String home(@RequestParam("searchField") String searchField
            ,Model model ) {
        model.addAttribute("listaDep", departmentRepository.findAll());
        List<Employee> listaEmp = employeeRepository.findByFirstNameAndLastName(searchField);
        model.addAttribute("listaEmployee", listaEmp);

        return "index";
    }
}
