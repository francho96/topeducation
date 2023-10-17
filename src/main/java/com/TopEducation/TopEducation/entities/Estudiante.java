package com.TopEducation.TopEducation.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Estudiante {
    @Id
    @Column(unique = true)
    private String rut;

    private String nombres;
    private String apellidos;
    private String dv;
    private LocalDate fechaNacimiento;
    private String nombreColegio;
    private String tipoColegio;
    private Integer anoEgreso;

    // getterss

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRut() {
        return rut;
    }

    public String getDv() {
        return dv;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public String getTipoColegio() {
        return tipoColegio;
    }

    public Integer getAnoEgreso() {
        return anoEgreso;
    }

    // Setters

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public void setTipoColegio(String tipoColegio) {
        this.tipoColegio = tipoColegio;
    }

    public void setAnoEgreso(Integer anoEgreso) {
        this.anoEgreso = anoEgreso;
    }
}
