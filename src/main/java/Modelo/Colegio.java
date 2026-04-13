/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Modelo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author crstc
 */
public class Colegio {
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Colegio() {
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }
    public void agregarProfesor(Profesor p){
        profesores.add(p);
        
    }
    public void agregarEstudiantes(Estudiante e){
        estudiantes.add(e);
    }

    
}
    
