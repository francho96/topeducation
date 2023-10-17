
package com.TopEducation.TopEducation.controllers;

import com.TopEducation.TopEducation.entities.Estudiante;
import com.TopEducation.TopEducation.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class IngresarEstudianteController {
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public IngresarEstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping("/nuevoestudiante")
    public String mostrarFormulario() {
        return "ingresarestudiante";
    }

    @PostMapping("/postdatos")
    public String guardarEstudiante(@RequestParam("nombres") String nombres,
                                    @RequestParam("apellidos") String apellidos,
                                    @RequestParam("rut") String rut,
                                    @RequestParam("dv") String dv,
                                    @RequestParam("fechaNacimiento") String fechaNacimientoStr,
                                    @RequestParam("nombreColegio") String nombreColegio,
                                    @RequestParam("tipoColegio") String tipoColegio,
                                    @RequestParam("anoEgreso") Integer anoEgreso) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

        Estudiante estudiante = new Estudiante();
        estudiante.setNombres(nombres);
        estudiante.setApellidos(apellidos);
        estudiante.setRut(rut);
        estudiante.setDv(dv);
        estudiante.setFechaNacimiento(fechaNacimiento);
        estudiante.setNombreColegio(nombreColegio);
        estudiante.setTipoColegio(tipoColegio);
        estudiante.setAnoEgreso(anoEgreso);

        estudianteRepository.save(estudiante);

        return "index";
    }
}