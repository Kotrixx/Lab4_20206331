/*package com.example.lab3.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "/jugador")
public class JugadorController {

    final com.example.lab3.repositorio.DepartmentRepository jugadorRepository;
    final com.example.lab3.repositorio.CountryRepository seleccionRepository;

    public JugadorController(com.example.lab3.repositorio.DepartmentRepository jugadorRepository, com.example.lab3.repositorio.CountryRepository seleccionRepository) {
        this.jugadorRepository = jugadorRepository;
        this.seleccionRepository = seleccionRepository;
    }


    @GetMapping(value = "")
    public String listarJugadores(Model model) {
        model.addAttribute("lista", jugadorRepository.findAll());
        return "jugador/lista";
    }

    @GetMapping(value = "/nuevo")
    public String nuevoJugadorForm(Model model) {
        model.addAttribute("listaSelecciones", seleccionRepository.findAll());
        return "jugador/nuevo";
    }
    @GetMapping("/borrar")
    public String borrarJugador(@RequestParam("id") int id) {

        Optional<com.example.lab3.entidad.Department> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador";
    }

    @PostMapping(value = "/guardar")
    public String nuevoJugador(Model model, com.example.lab3.entidad.Department jugador) {
        System.out.println("nombre: "+jugador.getNombre());
        System.out.println("club: "+jugador.getClub());
        System.out.println(jugador.getIdSeleccion());
        jugadorRepository.save(jugador);
        return "redirect:/jugador";
    }
}
*/