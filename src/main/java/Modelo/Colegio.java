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
        public String reporteEstudiantes(){
        String reporte = "===Lista Estudiantes===\n\n";
        for(Estudiante e:estudiantes){
            reporte+= e.toString()+"\n\n";
        }
        return reporte;
    }
    public String reporteProfesorPorSalario(){
        List<Profesor> ordenados= new ArrayList<>(profesores);
        for (int i=0; i<ordenados.size()-1;i++){
            for (int j=i+1; j<ordenados.size();j++){
                if(ordenados.get(i).calcularPagoMensual()<ordenados.get(j).calcularPagoMensual()){
                    Profesor temp= ordenados.get(i);
                    ordenados.set(i, ordenados.get(j));
                    ordenados.set(j,temp);
                }
            }
        }
        String reporte="=== Lista Profesores por salario ===\n\n";
        double totalPrestaciones=0;
        for (Profesor p: ordenados){
            reporte+=p.toString()+"\n\n";
            totalPrestaciones += p.calcularPrestaciones();
        }
        reporte += "Total prestaciones totales: "+ totalPrestaciones;
        return reporte;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    
}
    
