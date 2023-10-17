package com.TopEducation.TopEducation.repository;

import com.TopEducation.TopEducation.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    Estudiante findByRut(String rut);
}