package com.TopEducation.TopEducation.controllers;

import com.TopEducation.TopEducation.entities.Estudiante;
import com.TopEducation.TopEducation.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OperarEstudianteController {
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public OperarEstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/generarcuota/{rut}")
    public String operarEstudiante(@PathVariable String rut, Model model) {
        Estudiante estudiante = estudianteRepository.findByRut(rut);
        model.addAttribute("estudiante", estudiante);

        return "generarcuota_estudiante";
    }
}
