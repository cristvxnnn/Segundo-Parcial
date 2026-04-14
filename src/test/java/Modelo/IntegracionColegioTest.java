package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionColegioTest {

    @Test
    public void testFlujoCompletoColegio() {
        // Crear colegio
        Colegio colegio = new Colegio();

        // Crear fecha
        Fecha fecha = new Fecha(10, 5, 1990);

        // Crear profesor
        Profesor profesor = new Profesor(
                "123", "Matematicas", 10000, 10,
                "Juan", "Calle 1", "111", fecha
        );

        // Crear estudiante
        Estudiante estudiante = new Estudiante(
                "001", "11",
                "Ana", "Calle 2", "222", fecha
        );

        // Agregar al colegio
        colegio.agregarProfesor(profesor);
        colegio.agregarEstudiantes(estudiante);

        // Generar reportes
        String reporteProfes = colegio.reporteProfesorPorSalario();
        String reporteEst = colegio.reporteEstudiantes();

        // Verificaciones
        assertTrue(reporteProfes.contains("Juan"));
        assertTrue(reporteEst.contains("Ana"));

        // Verificar cálculo real integrado
        double pago = profesor.calcularPagoMensual();
        assertTrue(pago > 0);

        double prestaciones = profesor.calcularPrestaciones();
        assertTrue(prestaciones > 0);
    }
}