package pe.edu.cibertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImpuestoRentaTest {
    @Test
    public void tasa0True() {
        ImpuestoRenta c = new ImpuestoRenta(4000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 0%: " + iR);
        assertTrue(c.calcularImpuesto() == 0.00);
    }

    @Test
    public void tasa0False() {
        ImpuestoRenta c = new ImpuestoRenta(4000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 0%: " + iR);
        assertFalse(c.calcularImpuesto() != 0.00);
    }

    @Test
    public void tasa0Equals() {
        ImpuestoRenta c = new ImpuestoRenta(4000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 0%: " + iR);
        assertEquals(c.calcularImpuesto() , 0.00);
    }

    @Test
    public void tasa8True() {
        ImpuestoRenta c = new ImpuestoRenta(30000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 8%: " + iR);
        assertTrue(c.calcularImpuesto() == 188.00);
    }

    @Test
    public void tasa8False() {
        ImpuestoRenta c = new ImpuestoRenta(30000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 8%: " + iR);
        assertFalse(c.calcularImpuesto() != 188.00);
    }

    @Test
    public void tasa8Equals() {
        ImpuestoRenta c = new ImpuestoRenta(30000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 8%: " + iR);
        assertEquals(c.calcularImpuesto() , 188.00);
    }

    @Test
    public void tasa14True() {
        ImpuestoRenta c = new ImpuestoRenta(50000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 14%: " + iR);
        assertTrue(c.calcularImpuesto() == 1944.00);
    }

    @Test
    public void tasa14False() {
        ImpuestoRenta c = new ImpuestoRenta(50000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 14%: " + iR);
        assertFalse(c.calcularImpuesto() != 1944.00);
    }

    @Test
    public void tasa14Equals() {
        ImpuestoRenta c = new ImpuestoRenta(50000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 14%: " + iR);
        assertEquals(c.calcularImpuesto() , 1944.00);
    }

    @Test
    public void tasa17True() {
        ImpuestoRenta c = new ImpuestoRenta(120000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 17%: " + iR);
        assertTrue(c.calcularImpuesto() == 12144.50);
    }

    @Test
    public void tasa17False() {
        ImpuestoRenta c = new ImpuestoRenta(120000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 17%: " + iR);
        assertFalse(c.calcularImpuesto() != 12144.50);
    }

    @Test
    public void tasa17Equals() {
        ImpuestoRenta c = new ImpuestoRenta(120000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 17%: " + iR);
        assertEquals(c.calcularImpuesto() , 12144.50);
    }

    @Test
    public void tasa20True() {
        ImpuestoRenta c = new ImpuestoRenta(200000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 20%: " + iR);
        assertTrue(c.calcularImpuesto() == 26767.50);
    }

    @Test
    public void tasa20False() {
        ImpuestoRenta c = new ImpuestoRenta(200000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 20%: " + iR);
        assertFalse(c.calcularImpuesto() != 26767.50);
    }

    @Test
    public void tasa20Equals() {
        ImpuestoRenta c = new ImpuestoRenta(200000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 20%: " + iR);
        assertEquals(c.calcularImpuesto() , 26767.50);
    }

    @Test
    public void tasa30True() {
        ImpuestoRenta c = new ImpuestoRenta(300000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 30%: " + iR);
        assertTrue(c.calcularImpuesto() == 56227.50);
    }

    @Test
    public void tasa30False() {
        ImpuestoRenta c = new ImpuestoRenta(300000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 30%: " + iR);
        assertFalse(c.calcularImpuesto() != 56227.50);
    }

    @Test
    public void tasa30Equals() {
        ImpuestoRenta c = new ImpuestoRenta(300000);
        double iR = Math.rint(c.calcularImpuesto()*100)/100;
        System.out.println("Tasa 30%: " + iR);
        assertEquals(c.calcularImpuesto() , 56227.50);
    }
}
