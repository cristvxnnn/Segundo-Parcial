package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testCreacionEstudiante() {
        Fecha f = new Fecha(2, 2, 2010);
        Estudiante e = new Estudiante("001", "11", "Ana", 
                                     "Calle 2", "456", f);

        assertEquals("001", e.getCodigo());
        assertEquals("11", e.getGrado());
        assertEquals("Ana", e.getNombre());
    }
}