package pe.edu.cibertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Test
    public void trianguloNoExisteTrue() {
        System.out.println("Triangulo No Existe: 0, 20, 20");
        Triangulo c = new Triangulo(0, 20, 20);
        assertTrue(c.validarTipoTriangulo() == 0);
    }

    @Test
    public void trianguloNoExisteFalse() {
        System.out.println("Triangulo No Existe: 0, 20, 20");
        Triangulo c = new Triangulo(0, 20, 20);
        assertFalse(c.validarTipoTriangulo() != 0);
    }

    @Test
    public void trianguloNoExisteEquals() {
        System.out.println("Triangulo No Existe: 0, 20, 20");
        Triangulo c = new Triangulo(0, 20, 20);
        assertEquals(c.validarTipoTriangulo(), 0);
    }


    @Test
    public void trianguloEquilateroTrue() {
        System.out.println("Triangulo Equilatero: 20, 20, 20");
        Triangulo c = new Triangulo(20, 20, 20);
        assertTrue(c.validarTipoTriangulo() == 1);
    }

    @Test
    public void trianguloEquilateroFalse() {
        System.out.println("Triangulo Equilatero: 20, 20, 20");
        Triangulo c = new Triangulo(20, 20, 20);
        assertFalse(c.validarTipoTriangulo() != 1);
    }

    @Test
    public void trianguloEquilateroEquals() {
        System.out.println("Triangulo Equilatero: 20, 20, 20");
        Triangulo c = new Triangulo(20, 20, 20);
        assertEquals(c.validarTipoTriangulo(), 1);
    }

    @Test
    public void trianguloIsocelesTrue() {
        System.out.println("Triangulo Isoceles: 20, 20, 10");
        Triangulo c = new Triangulo(20, 20, 10);
        assertTrue(c.validarTipoTriangulo() == 2);
    }

    @Test
    public void trianguloIsocelesFalse() {
        System.out.println("Triangulo Isoceles: 20, 20, 10");
        Triangulo c = new Triangulo(20, 20, 10);
        assertFalse(c.validarTipoTriangulo() != 2);
    }

    @Test
    public void trianguloIsocelesEquals() {
        System.out.println("Triangulo Isoceles: 20, 20, 10");
        Triangulo c = new Triangulo(20, 20, 10);
        assertEquals(c.validarTipoTriangulo(), 2);
    }

    @Test
    public void trianguloEscalenosTrue() {
        System.out.println("Triangulo Escaleno: 10, 20, 25");
        Triangulo c = new Triangulo(10, 20, 25);
        assertTrue(c.validarTipoTriangulo() == 3);
    }

    @Test
    public void trianguloEscalenosFalse() {
        System.out.println("Triangulo Escaleno: 10, 20, 25");
        Triangulo c = new Triangulo(10, 20, 25);
        assertFalse(c.validarTipoTriangulo() != 3);
    }

    @Test
    public void trianguloEscalenosEquals() {
        System.out.println("Triangulo Escaleno: 10, 20, 25");
        Triangulo c = new Triangulo(10, 20, 25);
        assertEquals(c.validarTipoTriangulo(), 3);
    }
}
