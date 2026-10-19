package jacobi;

public class Jacobi {
    public static void resolver() {
        int n = Defmatrix.b.length;
        double[] xActual = new double[n];
        double[] xNuevo = new double[n];

        System.arraycopy(Defmatrix.x0, 0, xActual, 0, n);

        System.out.println("--- MÉTODO DE JACOBI ---");
        boolean convergido = false;

        for (int k = 1; k <= Defmatrix.maxIteraciones; k++) {
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += Defmatrix.A[i][j] * xActual[j];
                    }
                }
                xNuevo[i] = (Defmatrix.b[i] - suma) / Defmatrix.A[i][i];
            }

            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - xActual[i]));
            }

            System.out.printf("Iteración %d: x1=%.5f, x2=%.5f, x3=%.5f, Error=%.6f\n", 
                    k, xNuevo[0], xNuevo[1], xNuevo[2], error);

            if (error < Defmatrix.tolerancia) {
                System.out.println("Jacobi convergió en la iteración: " + k + "\n");
                convergido = true;
                break;
            }

            System.arraycopy(xNuevo, 0, xActual, 0, n);
        }
        if (!convergido) {
            System.out.println("Jacobi alcanzó el máximo de iteraciones sin converger.\n");
        }
    }
}
