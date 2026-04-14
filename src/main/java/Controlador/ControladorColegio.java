/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.util.List;

/**
 *
 * @author crstc
 */
public class ControladorColegio {

    private Colegio colegio;

    public ControladorColegio() {
        this.colegio = new Colegio();
    }

    public String agregarProfesor(String nombre, String direccion, String telefono, int dia, int mes, int anio, String cedula, String area, double salarioPorHora, int horasDictadas) {
        Fecha fecha = new Fecha(dia, mes, anio);
        Profesor p = new Profesor(cedula, area, salarioPorHora, horasDictadas, nombre, direccion, telefono, fecha);
        colegio.agregarProfesor(p);
        return "Profesor agregado!\n" + p.toString();
    }

    public String agregarEstudiante(String nombre, String direccion, String telefono, int dia, int mes, int anio, String codigo, String grado) {
        Fecha fecha = new Fecha(dia, mes, anio);
        Estudiante e = new Estudiante(codigo, grado, nombre, direccion, telefono, fecha);
        colegio.agregarEstudiantes(e);
        return "Estudiante agregado!\n" + e.toString();
    }

    public String reporteEstudiantes() {
        return colegio.reporteEstudiantes();
    }

    public String reporteProfesores() {
        return colegio.reporteProfesorPorSalario();
    }

}
