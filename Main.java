import jacobi.Jacobi;
import gauss_seidel.GaussSeidel;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RESOLUCIÓN DE SISTEMAS DE ECUACIONES LINEALES ===");
        System.out.println("Docente: Víctor Hugo Vásquez Herrera - ITSX\n");

        // Ejecutar Jacobi
        Jacobi.resolver();

        // Ejecutar Gauss-Seidel
        GaussSeidel.resolver();
    }
}
