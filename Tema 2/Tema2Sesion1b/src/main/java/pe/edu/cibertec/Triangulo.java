package pe.edu.cibertec;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int validarTipoTriangulo() {
        if (!validarTriangulo()) {
            return 0;  // Triángulo no existe
        } else if (lado1 == lado2 && lado2 == lado3) {
            return 1;  // Triángulo Equilatero
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return 2; // Triángulo Isosceles
        } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
            return 3; // Triángulo Escaleno
        } else
            return 0; // Triángulo no existe
    }

    public boolean validarTriangulo(){
        if ( (lado1<(lado2+lado3)) && (lado1>Math.abs(lado2-lado3)) ) {
            if ( (lado2<(lado1+lado3)) && (lado2>Math.abs(lado1-lado3)) ) {
                if ( (lado3<(lado1+lado2)) && (lado3>Math.abs(lado1-lado2)) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
