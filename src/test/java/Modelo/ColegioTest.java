package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColegioTest {

    @Test
    public void testAgregarProfesor() {
        Colegio c = new Colegio();
        Fecha f = new Fecha(1,1,2000);

        Profesor p = new Profesor("123", "Math", 10000, 10,
                                 "Juan", "Dir", "123", f);

        c.agregarProfesor(p);

        assertEquals(1, c.getProfesores().size());
    }

    @Test
    public void testAgregarEstudiante() {
        Colegio c = new Colegio();
        Fecha f = new Fecha(1,1,2010);

        Estudiante e = new Estudiante("001", "10",
                                     "Ana", "Dir", "456", f);

        c.agregarEstudiantes(e);

        assertEquals(1, c.getEstudiantes().size());
    }

    @Test
    public void testReporteEstudiantes() {
        Colegio c = new Colegio();
        Fecha f = new Fecha(1,1,2010);

        Estudiante e = new Estudiante("001", "10",
                                     "Ana", "Dir", "456", f);

        c.agregarEstudiantes(e);

        String reporte = c.reporteEstudiantes();

        assertTrue(reporte.contains("Ana"));
    }

    @Test
    public void testOrdenProfesoresPorSalario() {
        Colegio c = new Colegio();
        Fecha f = new Fecha(1,1,2000);

        Profesor p1 = new Profesor("1", "Math", 10000, 10,
                                  "Juan", "Dir", "123", f);
        Profesor p2 = new Profesor("2", "Math", 20000, 10,
                                  "Pedro", "Dir", "123", f);

        c.agregarProfesor(p1);
        c.agregarProfesor(p2);

        String reporte = c.reporteProfesorPorSalario();

        // Pedro debería aparecer primero (mayor salario)
        assertTrue(reporte.indexOf("Pedro") < reporte.indexOf("Juan"));
    }
}