package com.TopEducation.TopEducation.controllers;

import com.TopEducation.TopEducation.entities.Estudiante;
import com.TopEducation.TopEducation.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ObtenerEstudiantesController {

        private final EstudianteRepository estudianteRepository;

        @Autowired
        public ObtenerEstudiantesController(EstudianteRepository estudianteRepository) {
            this.estudianteRepository = estudianteRepository;
        }
        @GetMapping("/generarcuota")
        public String listarEstudiantes(Model model) {
            List<Estudiante> estudiantes = estudianteRepository.findAll();
            model.addAttribute("estudiantes", estudiantes);
            System.out.println(estudiantes);
            return "generarcuota";
        }
}
