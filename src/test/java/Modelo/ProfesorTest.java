package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    public void testCalcularPagoMensual() {
        Fecha f = new Fecha(1, 1, 2000);
        Profesor p = new Profesor("123", "Matematicas", 10000, 10, 
                                 "Juan", "Calle 1", "123", f);

        double esperado = 10000 * 10 * 1.30;
        assertEquals(esperado, p.calcularPagoMensual());
    }

    @Test
    public void testCalcularPrestaciones() {
        Fecha f = new Fecha(1, 1, 2000);
        Profesor p = new Profesor("123", "Matematicas", 10000, 10, 
                                 "Juan", "Calle 1", "123", f);

        double esperado = p.calcularPagoMensual() * 0.19;
        assertEquals(esperado, p.calcularPrestaciones());
    }

    @Test
    public void testSobrecargaPagoMensual() {
        Fecha f = new Fecha(1, 1, 2000);
        Profesor p = new Profesor("123", "Matematicas", 10000, 10, 
                                 "Juan", "Calle 1", "123", f);

        double esperado = 10000 * (10 + 5) * 1.30;
        assertEquals(esperado, p.calcularPagoMensual(5));
    }
}